package org.galsang.util.xml;

import org.galsang.util.file.FileUtil;
import org.junit.Test;

/**
 * Description： XML 工具类单元测试
 * <br />Author： vimx86
 */
public class XmlUtilTest extends XmlUtil {

    public static final String FILE_PATH = "classpath:FileUtil.xml";


    @Test
    public void xml2Json() throws Exception {

        String xmlStr = FileUtil.readFile(FILE_PATH);

        System.out.println("xml2Json:" + XmlUtil.xml2Json(xmlStr));

    }

    @Test
    public void xml2Map() throws Exception {

        String xmlStr = FileUtil.readFile(FILE_PATH);

        System.out.println("xml2Map:" + XmlUtil.xml2Map(xmlStr));

    }

}