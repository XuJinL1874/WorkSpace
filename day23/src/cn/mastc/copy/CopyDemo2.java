package cn.mastc.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: XuJin_L
 * @Description: 字符流复制文本文件,必须文本文件
 *                字符流查询本机默认的编码表,简体中文GBK
 *                FileReader读取数据源
 *                FileWriter写入到数据目的
 * @Date: Created in 13:22 2018/8/8
 * @Modified By:
 */
public class CopyDemo2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("e:\\abc\\1.txt");
            fw = new FileWriter("e:\\abc\\a\\1.txt");
            char[] cbuf = new char[1024];
            int len = 0;
            while ((len = fr.read(cbuf)) !=- 1){
                fw.write(cbuf, 0, len);
                fw.flush();
            }
        }catch (IOException e){
            System.out.println(e);
            throw new RuntimeException("复制失败!");
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e){
                throw new RuntimeException("释放资源失败!");
            }finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                }catch(IOException e){
                    throw new RuntimeException("释放资源失败!");
                }
            }
        }
    }
}
