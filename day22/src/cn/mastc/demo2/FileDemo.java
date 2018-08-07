package cn.mastc.demo2;

import java.io.File;

/**
 * @Author: XuJin_L
 * @Description: 对一个目录下的所有内容,进行遍历
 *                编程技巧,方法的递归调用,自己调用自己
 * @Date: Created in 13:14 2018/8/7
 * @Modified By:
 */
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("e:\\abc");
        getAllDir(dir);
    }

    public static void getAllDir(File dir) {
        // 调用方法listFile()对目录,dir进行遍历
        File[] fileArr = dir.listFiles();
        for (File f : fileArr) {
            // 判断变量f表示的路径是不是文件夹
            if (f.isDirectory()) {
                // 是一个目录,就要去遍历这个目录
                // 本方法,getAllDir,就是给个目录去遍历
                // 继续调用getAllDir,传递他目录
                getAllDir(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
