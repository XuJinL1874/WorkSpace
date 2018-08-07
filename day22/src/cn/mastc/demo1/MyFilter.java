package cn.mastc.demo1;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: XuJin_L
 * @Description: 自定义过滤器
 *                实现FileFilter接口,重写抽象方法
 * @Date: Created in 21:37 2018/8/6
 * @Modified By:
 */
public class MyFilter implements FileFilter {
    public boolean accept(File pathname){
        /**
         * pathname 接收到的也是文件的全路径
         * c:\\abc\\a1.txt
         * 对路径进行判断,如果是java文件,返回true,不是java文件,返回false
         * 文件的的后缀结尾是.java
         */
        String name = pathname.getName();
        return name.endsWith(".java");
    }
}
