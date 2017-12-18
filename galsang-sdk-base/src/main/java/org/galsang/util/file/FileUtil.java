package org.galsang.util.file;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Description： 文件操作相关类
 * <br />Author： vimx86
 */
public class FileUtil {

    public static final String DEFAULT_ENCODING = "UTF-8";

    public static final String CLASSPATH_PREFIX = "classpath:";

    /**
     * 读取文件中的内容保存为字符串
     *
     * @param path        文件地址
     * @param charsetName 字符编码
     * @return 字符串
     * @throws Exception
     */
    public static String readFile(String path, String charsetName) throws Exception {

        path = FileUtil.getPath(path);

        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(new Long(file.length()).intValue());
        fc.read(bb);
        bb.flip();
        String str = new String(bb.array(), charsetName);
        fc.close();
        fis.close();
        return str;
    }


    /**
     * 读取文件中的内容保存为字符串
     *
     * @param path 文件地址
     * @return 字符串
     * @throws Exception
     */
    public static String readFile(String path) throws Exception {
        return FileUtil.readFile(path, DEFAULT_ENCODING);
    }

    /**
     * 获取 ClassPath 路径
     *
     * @return
     */
    public static String classPath() {

        String path = Thread.currentThread().getClass().getResource("/").toString();

        // 去除 “file:/” 文件标识
        path = path.substring(6);

        System.out.println(" 类所在的 ClassPath 路径 === " + path);

        return path;
    }

    /**
     * 解析路径，，，识别是否使用了 classpath 功能
     * <br /> 如果前缀含有 “classpath:”，则进行路径解析
     *
     * @param path 要解析的路径
     * @return 解析后的路径
     */
    public static String getPath(String path) {

        // path 不能为null
        if (null == path) {
            return null;
        }

        if (path.startsWith("classpath:")) {
            path = FileUtil.classPath() + path.substring(CLASSPATH_PREFIX.length());
        }
        System.out.println(" 文件路径 === " + path);
        return path;
    }

    /**
     * 将指定目录设置为空目录：
     * <br />如果目录不存在，则创建目录；
     * <br />如果目录已存在，则删除目录下所有文件
     *
     * @param dir 文件目录
     */
    public static void handlerBlankDir(File dir) {
        if (!dir.exists()) {
            dir.mkdirs();
        } else {
            //删除原有文件
            File[] files = dir.listFiles();
            for (File f : files) {
                if (f.exists()) {
                    f.delete();
                }
            }
        }
    }

    /**
     * 文件中行前行后追加数据处理
     *
     * @param filePath 文件路径
     * @param before   行之前追加数据
     * @param after    行之后追加数据
     * @param isBefore 是否在行之前追加数据
     * @param isAfter  是否在行之后追加数据
     */
    public static void editFileLineContent(String filePath, String before, String after, Boolean isBefore, Boolean isAfter) {

        File file = new File(filePath);

        StringBuilder result = new StringBuilder();
        try {
            //构造一个BufferedReader类来读取文件 并指定文件编码
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                if (isBefore && isAfter) {
                    result.append(before).append(s).append(after).append(System.lineSeparator());
                } else if (isBefore) {
                    result.append(before).append(s).append(System.lineSeparator());
                } else if (isAfter) {
                    result.append(s).append(after).append(System.lineSeparator());
                }
            }
            br.close();

            System.out.println(result);

            // 将转换过后的内容保存到文件
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(String.valueOf(result));
            output.flush();
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
