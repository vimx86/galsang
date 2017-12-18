package org.galsang.util.regex;

import org.junit.Test;

/**
 * Description： 规则校验工具单元测试类
 * <br /> Author： vimx86
 */
public class ValidateUtilTest {
    @Test
    public void validateRegex() throws Exception {
        System.out.println(ValidateUtil.validateRegex("123", "^\\d+$"));
    }

}