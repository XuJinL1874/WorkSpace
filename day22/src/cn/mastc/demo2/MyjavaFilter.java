package cn.mastc.demo2;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: XuJin_L
 * @Description:
 * @Date: Created in 15:28 2018/8/7
 * @Modified By:
 */
public class MyjavaFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        // 判断获取的目录,直接返回true
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().endsWith(".java");
    }
}
