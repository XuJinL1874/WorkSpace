package cn.mastc.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author: XuJin_L
 * @Description: 转换流
 *                   java.io.OutputStreamWriter 继承Writer类
 *                   就是一个字符输出流,写文本文件
 *                   write()字符, 字符数组, 字符串
 *
 *                   字符通向字节的桥梁,将字符流转字节流
 *
 *                   OutputStreamWriter 使用方式
 *                      构造方法:
 *                          OutputStreamWriter(OutputStream out)接收所有的字节输出流
 *                          但是: 字节输出流: FileOutputStream
 *
 *                   OutputStreamWr码表名字iter(OutputStream out, String charsetName)
 *  *                   String charsetName 传递编 GBK UTF-8
 *
 *                   OutputStreamWriter 有个子类, FileWriter
 * @Date: Created in 13:56 2018/8/8
 * @Modified By:
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException{
        writeGBK();
        writeUTF();
    }
    /**
     * 转换流对象 OutputStreamWriter写文本
     * 文本采用GBK的形式写入
     */
    public static void writeUTF() throws IOException {
        // 创建字节输出流,绑定数据文件
        FileOutputStream fos = new FileOutputStream("e:\\abc\\utf.txt");
        // 创建转换流对象,构造方法,绑定字节输出流,使用UTF-8编码表
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        // 转换流写数据
        osw.write("你好");

        osw.close();
    }

    /**
     * 转换流对象OutputStreamWriter 写文本
     * 采用UTF-8编码表写入
     */
    public static void writeGBK() throws IOException{
        // 创建字节输入流,绑定文件
        FileOutputStream fos = new FileOutputStream("e:\\abc\\gbk.txt");
        // 创建转换流对象,构造方法保证字节输出流,并指定编码表是GBK
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
        osw.write("你好");
        osw.close();
    }
}
