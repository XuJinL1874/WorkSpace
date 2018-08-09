package cn.mastc.demo1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: XuJin_L
 * @Description: 字节输出流的缓冲流
 *                   java.io.BufferedOutputStream
 *                   作用: 提高原有输出流的写入效率
 *                   BufferedOutputStream 继承 OutputStream
 *                   方法: 写入write 字节, 字节数组
 *
 *                 构造方法:
 *                   BufferedOutputStream(OutputStream out)
 *                   可以传递任意的字节输出流,传递的是哪个字节流,就对哪个字节流提高效率
 *
 *                   FileOutputStream
 * @Date: Created in 12:32 2018/8/9
 * @Modified By:
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流,绑定文件
        FileOutputStream fos = new FileOutputStream("e:\\abc\\buffer.txt");
        // 创建字节输出流缓冲流对象,构造方法中,传递字节输入流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(55);

        // 数组
        byte[] bytes = "HelloWorld".getBytes();
        bos.write(bytes);
        bos.write(bytes, 3, 2);

        bos.close();
    }
}
