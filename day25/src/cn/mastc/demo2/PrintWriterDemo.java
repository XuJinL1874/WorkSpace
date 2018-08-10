package cn.mastc.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @Author: XuJin_L
 * @Description: 打印流
 *                   PrintStream
 *                   PrintWriter
 *                 打印流的特点:
 *                   1. 此流不负责数据源,只负责数据目的
 *                   2. 为其他输出流,添加功能
 *                   3. 永远不会抛出IOException
 *                      但是,可能抛出其他异常
 *
 *                  两个打印流的方法,完全一致
 *                      构造方法,就是打印流的输出目的端
 *                      PrintStream
 *                          构造方法,接收File类型,接收字符串文件名,接收字节输出流OutputStream
 *                      PrintWriter
 *                          构造方法,接收File类型,接收字符串文件名,接收字节输出流OutputStream, 接收字符输出流Writer
 * @Date: Created in 16:35 2018/8/10
 * @Modified By:
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException{
        function();
        function_1();
        function_2();
    }
    /**
     * 打印流,向File对象的数据目的写入数据
     * 方法print println  原样输出
     * write方法走码表
     */
    public static void function() throws FileNotFoundException {
        File file = new File("e:\\1.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(100);
        pw.flush();
        pw.close();
    }
    /**
     * 打印流,输出目的,String文件名
     */
    public static void function_1()throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("e:\\2.txt");
        pw.println(3.5);
        pw.flush();
        pw.close();
    }
    /**
     * 打印流,输出目的,是流对象
     * 可以是字节输出流,可以是字符输出流
     * OutputStream Writer
     */
    public static void function_2()throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("e:\\3.txt");
        PrintWriter pw = new PrintWriter(fos);
        pw.println("打印流");
        pw.flush();
        pw.close();
    }
}
