package cn.mastc.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: XuJin_L
 * @Description: 转换流
 *                   java.io.InputStreamReader 继承Reader
 *                   字符输入流读取文本文件
 *
 *                 字节流向字符流的桥梁, 将字节流转字符流
 *
 *                 读取的方法:
 *                    read() 读取一个字符,读取字符数组
 *                 技巧: OutputStreamWriter写了文件
 *                    InputStreamReader读取文件
 *
 *                 OutputStreamWriter(OutputStream out) 所有字节输入流
 *                 InputStreamReader(InputStream in) 接收所有的字节输入流
 *                      可以传递的字节输入流: FileInputStream
 *                 InputStreamReader(InputStream in, String charsetName) 传递编码表的名字
 *
 * @Date: Created in 15:27 2018/8/8
 * @Modified By:
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException{
        readGBK();
        readUTF();
    }
    /**
     * 转换流,InputStreamReader 读取文本
     * 采用默认编码表,读取GBK文件
     */
    public static void readGBK() throws IOException {
        // 创建自己输入流,传递文本文件
        FileInputStream fis = new FileInputStream("e:\\abc\\gbk.txt");
        // 创建转换流对象,构造方法,包装字节输入流
        InputStreamReader isr = new InputStreamReader(fis);
        char[] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch, 0, len));

        isr.close();
    }

    /**
     * 转换流,InputStreamReader 读取文本
     * 采用UTF-8编码表,读取文件utf
     */
    public static void readUTF() throws IOException {
        // 创建自己输入流,传递文本文件
        FileInputStream fis = new FileInputStream("e:\\abc\\utf.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        char[] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch, 0, len));
        isr.close();
    }
}
