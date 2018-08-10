package cn.mastc.copy;

import java.io.*;

/**
 * @Author: XuJin_L
 * @Description: 打印流实现文本复制
 *                   读取数据源 BufferedReader+File 读取文本行
 *                   写入数据目的 PrintWriter+println 自动刷新
 * @Date: Created in 20:16 2018/8/10
 * @Modified By:
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("e:\\1.txt");
        BufferedReader bfr = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(new FileWriter("d:\\1.txt"), true);
        String line = null;
        while ((line = bfr.readLine()) != null){
            pw.println(line);
        }
        pw.close();
        bfr.close();
    }
}
