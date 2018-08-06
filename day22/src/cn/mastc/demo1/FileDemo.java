package cn.mastc.demo1;

import java.io.File;

/**
 * @Author: XuJin_L
 * @Description: File类获取功能
 *                list
 *                listFiles
 * @Date: Created in 20:32 2018/8/6
 * @Modified By:
 */
public class FileDemo {
    public static void main(String[] args) {
        // function();
        function_1();
        //function_2();
    }

    /**
     * File类的获取功能
     * String[] list()
     * 获取到,File构造方法中封装的路径中的文件和文件夹名
     * 返回只有名字
     */
    public static void function(){
        File file = new File("e:\\abc");
        String[] strArr = file.list();
        // System.out.println(strArr.length);
        for (String str : strArr) {
            System.out.println(str);
        }
    }
    /**
     * File类的获取功能
     * File[] listFile()
     * 获取到,File构造方法中封装的路径中的文件和文件夹名
     * 返回的是目录或者文件的全路径
     */
    public static void function_1(){
        File file = new File("e:\\abc");
        File[] fileArr = file.listFiles();
        for (File f : fileArr){
            System.out.println(f);
        }
    }

    /**
     * 获得系统中的所有根目录
     */
    public static void function_2(){
        File[] fileArr = File.listRoots();
        for (File f : fileArr) {
            System.out.println(f);
        }
    }
}
