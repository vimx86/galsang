package org.galsang.util.file;

import org.junit.Test;

/**
 * Description：文件工具类单元测试
 * <br />Author： vimx86
 */
public class FileUtilTest extends FileUtil {
    @Test
    public void readFile() throws Exception {

        String filePath = "classpath:/FileUtil.xml";
        System.out.println("filePath === " + filePath);

        String fileStr = FileUtil.readFile(filePath);
        System.out.println("fileStr === " + fileStr);
    }

    @Test
    public void readFile1() throws Exception {
    }

}