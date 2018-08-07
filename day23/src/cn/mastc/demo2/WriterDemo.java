package cn.mastc.demo2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: XuJin_L
 * @Description: 字符输出流
 *                   java.io.Writer 所有字符输出流的超类
 *                 局限性: 只能写文本,文本文件
 *
 *                 写的方法writer
 *                    write(int c) 写1个字符
 *                    write(char[] c) 写字符数组
 *                    write(char[] c, int, int) 字符数组一部分, 开始索引, 写几个
 *                    write(String s) 写入字符串
 *
 *                  Writer类的子类对象FileWriter
 *
 *                  构造方法: 写入的数据目的
 *                     File 类型对象
 *                     String 文件名
 *
 *                   字符输出流写数据的时候,必须要运行一个功能,刷新功能
 *                   flush()
 * @Date: Created in 23:55 2018/8/7
 * @Modified By:
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e:\\abc\\1.txt");

        // 写一个字符
        fw.write(100);
        fw.flush();

        // 写一个字符数组
        char[] c = {'a', 'b', 'c', 'd', 'e'};
        fw.write(c);
        fw.flush();

        // 写字符数组的一部分
        fw.write(c ,2, 2);
        fw.flush();

        // 写一个字符数组
        char[] d = {'a', 'b', 'c', 'd', 'e'};
        fw.flush();

        fw.close();
    }
}
