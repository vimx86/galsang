package org.galsang.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description： 规则校验工具
 * <br /> Author： vimx86
 */
public class ValidateUtil {

    /**
     * 验证数据是否符合指定规则
     *
     * @param data       要验证的数据
     * @param regexCheck 验证规则（正则表达式）
     * @return 验证通过则返回true，否则返回false
     */
    public static boolean validateRegex(String data, String regexCheck) {
        Pattern regex = Pattern.compile(regexCheck);
        Matcher matcher = regex.matcher(data);
        return matcher.matches();
    }

}
