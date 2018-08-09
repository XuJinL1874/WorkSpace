package cn.mastc.copy;

import java.io.*;

/**
 * @Author: XuJin_L
 * @Description: 文件复制方式,字节流,一共四个方式
 *                 1. 字节流读写单个字节         500039ms
 *                 2. 字节流读写字节数组         720ms
 *                 3. 字节流缓冲流读取单个字节   1530ms
 *                 4. 字节缓冲区流读取字节数组   167ms
 * @Date: Created in 13:47 2018/8/9
 * @Modified By:
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException{
        long s = System.currentTimeMillis();
        copy_4(new File("d:\\vc.zip"), new File("e:\\vc.zip"));
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
    /**
     * 方法,实现文件复制
     *      1. 字节流读写单个字节
     */
    public static void copy_1(File src, File desc) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        while ((len = fis.read()) != -1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
    /**
     * 方法,实现文件复制
     *      2. 字节流读写字节数组
     */
    public static void copy_2(File src, File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }
    /**
     * 方法,实现文件复制
     *      3. 字节流缓冲流读取单个字节
     */
    public static void copy_3(File src, File desc) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
    /**
     * 方法,实现文件复制
     *      4. 字节缓冲区流读取字节数组
     */
    public static void copy_4(File src, File desc) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
