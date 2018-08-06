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
        return true;
    }
}
