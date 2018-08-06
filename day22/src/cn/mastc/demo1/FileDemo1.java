package cn.mastc.demo1;

import java.io.File;

/**
 * @Author: XuJin_L
 * @Description: File类的获取,文件获取过滤器
 *                遍历目录的时候,可以根据需要,只获取满足条件的文件
 *                遍历目录方法listFiles()重载形式
 *                listFiles(FileFilter filter)接口类型
 *                传递FileFilter接口的实现类
 *                自定义FileFilter接口的实现类,重写抽象方法,
 *                接口实现类对象传递到遍历方法listFiles
 * @Date: Created in 21:28 2018/8/6
 * @Modified By:
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("e:\\abc");
        File[] fileArr = file.listFiles(new MyFilter());
        for (File f: fileArr) {
            System.out.println(f);
        }
    }
}
