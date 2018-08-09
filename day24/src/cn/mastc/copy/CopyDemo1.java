package cn.mastc.copy;

import java.io.*;

/**
 * @Author: XuJin_L
 * @Description: 使用缓冲区流对象,复制文本文件
 *                数据源 BufferedReader+FileReader 读取
 *                数据目的 BufferedWriter+FileWriter 写入
 *                读取文本行,读一行,写一行,写换行
 * @Date: Created in 16:06 2018/8/9
 * @Modified By:
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建读取数据流对象
        FileReader fr = new FileReader("d:\\w.txt");
        // 创建缓冲流对象
        BufferedReader bfr = new BufferedReader(fr);
        // 创建写入流对象
        FileWriter fw = new FileWriter("e:\\w.txt");
        // 创建缓冲流对象
        BufferedWriter bfw = new BufferedWriter(fw);
        // 读取文本行,读一行,写一行,写换行
        String line = null;
        while ((line = bfr.readLine()) != null){
            bfw.write(line);
            bfw.newLine();
            bfw.flush();
        }
        fr.close();
        bfr.close();
        fw.close();
        bfw.close();
    }
}
