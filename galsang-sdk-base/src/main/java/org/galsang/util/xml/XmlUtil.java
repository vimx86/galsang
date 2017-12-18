package org.galsang.util.xml;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description： XML 操作相关工具类
 * <br /> 转换成 JSON 依赖于 fastjson
 * <br />Author： vimx86
 */
public class XmlUtil {


    /**
     * 将xml字符串转换为Json对象
     *
     * @param xmlStr xml 字符串
     * @return Json 对象<code>JSONObject</code>
     * @throws DocumentException XML文档异常
     */
    public static JSONObject xml2Json(String xmlStr) throws DocumentException {
        Document document = DocumentHelper.parseText(xmlStr);
        JSONObject json = new JSONObject();
        dom4j2Json(document.getRootElement(), json);
        document = null;
        return json;
    }

    /**
     * 将xml字符串转换为Map对象
     *
     * @param xmlStr xml 字符串
     * @return Map 对象
     * @throws DocumentException XML文档异常
     */
    public static Map<String, Object> xml2Map(String xmlStr) throws DocumentException {
        Document document = DocumentHelper.parseText(xmlStr);
        Map<String, Object> map = new HashMap<>();
        dom4j2Map(document.getRootElement(), map);
        document = null;
        return map;
    }


    /**
     * 解析成Json
     *
     * @param element Dom 元素
     * @param json    json 对象
     */
    private static void dom4j2Json(Element element, JSONObject json) {

        //如果是属性
        for (Object o : element.attributes()) {
            Attribute attr = (Attribute) o;
            if (!isEmpty(attr.getValue())) {
                json.put("@" + attr.getName(), attr.getValue());
            }
        }

        // 如果是子元素
        List<Element> chdEl = element.elements();
        if (chdEl.isEmpty() && !isEmpty(element.getText())) {//如果没有子元素,只有一个值
            json.put(element.getName(), element.getText());
        }

        // 区分有子元素的各种情况
        for (Element e : chdEl) {//有子元素
            if (!e.elements().isEmpty()) {//子元素也有子元素
                JSONObject chdjson = new JSONObject();
                dom4j2Json(e, chdjson);
                Object o = json.get(e.getName());
                if (o != null) {
                    JSONArray jsona = null;
                    if (o instanceof JSONObject) {//如果此元素已存在,则转为jsonArray
                        JSONObject jsono = (JSONObject) o;
                        json.remove(e.getName());
                        jsona = new JSONArray();
                        jsona.add(jsono);
                        jsona.add(chdjson);
                    }
                    if (o instanceof JSONArray) {
                        jsona = (JSONArray) o;
                        jsona.add(chdjson);
                    }
                    json.put(e.getName(), jsona);
                } else {
                    if (!chdjson.isEmpty()) {
                        json.put(e.getName(), chdjson);
                    }
                }


            } else {//子元素没有子元素
                for (Object o : element.attributes()) {
                    Attribute attr = (Attribute) o;
                    if (!isEmpty(attr.getValue())) {
                        json.put("@" + attr.getName(), attr.getValue());
                    }
                }
                if (!e.getText().isEmpty()) {
                    json.put(e.getName(), e.getText());
                }
            }
        }
    }

    /**
     * 解析成Map
     *
     * @param element Dom 元素
     * @param map     map 对象
     */
    private static void dom4j2Map(Element element, Map<String, Object> map) {

        //如果是属性
        for (Object o : element.attributes()) {
            Attribute attr = (Attribute) o;
            if (!isEmpty(attr.getValue())) {
                map.put(attr.getName(), attr.getValue());
            }
        }

        // 如果是子元素
        List<Element> chdEl = element.elements();
        if (chdEl.isEmpty() && !isEmpty(element.getText())) {//如果没有子元素,只有一个值
            map.put(element.getName(), element.getText());
        }

        // 区分有子元素的各种情况
        for (Element e : chdEl) {//有子元素
            if (!e.elements().isEmpty()) {//子元素也有子元素
                Map<String, Object> chdMap = new HashMap<>();
                dom4j2Map(e, chdMap);
                Object o = map.get(e.getName());
                if (o != null) {
                    List<Object> list = null;
                    if (o instanceof Map) {//如果此元素已存在,则转为jsonArray
                        Map<String, Object> mapO = (Map<String, Object>) o;
                        map.remove(e.getName());
                        list = new ArrayList<>();
                        list.add(mapO);
                        list.add(chdMap);
                    }
                    if (o instanceof List) {
                        list = (List) o;
                        list.add(chdMap);
                    }
                    map.put(e.getName(), list);
                } else {
                    if (!chdMap.isEmpty()) {
                        map.put(e.getName(), chdMap);
                    }
                }
            } else {//子元素没有子元素
                for (Object o : element.attributes()) {
                    Attribute attr = (Attribute) o;
                    if (!isEmpty(attr.getValue())) {
                        map.put(attr.getName(), attr.getValue());
                    }
                }
                if (!e.getText().isEmpty()) {
                    map.put(e.getName(), e.getText());
                }
            }
        }
    }

    /**
     * 判断节点是否为null， 字符串"null" 或 " null "
     *
     * @param str 节点内容
     * @return
     */
    private static boolean isEmpty(String str) {
        if (str == null || str.trim().isEmpty() || "null".equals(str)) {
            return true;
        }
        return false;
    }


}
