package cn.mastc.demo2;

import java.io.File;

/**
 * @Author: XuJin_L
 * @Description: 遍历目录,获取目录下的所有.java文件
 *                遍历多及目录,方法递归实现
 *                遍历的过程中使用过滤器
 * @Date: Created in 15:22 2018/8/7
 * @Modified By:
 */
public class FileDemo1 {
    public static void main(String[] args) {
        getAllJava(new File("e:\\abc"));
    }

    /**
     * 定义方法,实现遍历指定目录
     * 获取目录中的所有.java文件
     */
    public static void getAllJava(File dir) {
        // 调用File类对象方法listFiles()获取,加入过滤器
        File[] fileArr = dir.listFiles(new MyjavaFilter());
        for (File f : fileArr) {
            // 对f路径,判断是不是文件夹
            if (f.isDirectory()) {
                // 递归进入文件夹遍历
                getAllJava(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
