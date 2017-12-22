package org.galsang.admin.util.shiro;

import lombok.extern.slf4j.Slf4j;
import org.galsang.admin.base.model.AuthUser;
import org.junit.Test;

/**
 * Description： 密码工具单元测试类
 * <br /> Author： vimx86
 */
@Slf4j
public class PasswordHelperTest extends PasswordHelper {

    @Test
    public void TestEncryptPassword() {

        AuthUser user = new AuthUser();
        user.setUsername("root");
        user.setPassword("123456");

        log.info("user before ==== " + user);

        super.encryptPassword(user);

        log.info("user after ==== " + user);

    }
}