package org.galsang.admin.util.shiro;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.galsang.admin.base.model.AuthUser;

/**
 * Description：密码工具类
 * <br /> Author： vimx86
 */
public class PasswordHelper {

    private static final String ALGORITHM_NAME = "md5";
    private static final int HASH_ITERATIONS = 2;

    /**
     * 密码加密
     * @param user
     */
    public void encryptPassword(AuthUser user) {

        String newPassword = new SimpleHash(ALGORITHM_NAME, user.getPassword(), ByteSource.Util.bytes(user.getUsername()),
                HASH_ITERATIONS).toHex();

        user.setPassword(newPassword);

    }

}
