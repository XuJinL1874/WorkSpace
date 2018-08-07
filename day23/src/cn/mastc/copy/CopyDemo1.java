package cn.mastc.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: XuJin_L
 * @Description: 字节流复制文件
 *                   采用数组缓冲提高效率
 *                   字节数组
 *                   FileInputStream 读取字节数组
 *                   FileOutPUtStream 写字节数组
 * @Date: Created in 23:03 2018/8/7
 * @Modified By:
 */
public class CopyDemo1 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        // 定义两个流的对变量
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            // 建立两个流的对象,绑定数据源和数据目的
            fis = new FileInputStream("e:\\abc\\b.txt");
            fos = new FileOutputStream("e:\\abc\\a\\b.txt");
            //定义字节数组,缓冲
            int len = 0;
            byte[] bytes = new byte[1024 * 10];
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes, 0 ,len);
            }
        }catch(IOException e){
            System.out.println(e);
            throw new RuntimeException("文件复制失败");
        }finally{
            try {
                if (fos != null) {
                    fis.close();
                }
            }catch(IOException e){
                throw new RuntimeException("释放资源败");
            }finally{
                try {
                    if (fis != null) {
                        fis.close();
                    }
                }catch (IOException e){
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}