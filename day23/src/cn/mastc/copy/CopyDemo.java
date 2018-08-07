package cn.mastc.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: XuJin_L
 * @Description: 将数据源 e:\\abc\\b.txt
 *                复制到 d:\\b.txt
 *                字节输入流,绑定数据源
 *                字节输出流,绑定数据目的
 *
 *                输入,读取1个字节
 *                输出,写1个字节
 * @Date: Created in 22:32 2018/8/7
 * @Modified By:
 */
public class CopyDemo {
    public static void main(String[] args) {
        // 定义两个流的对变量
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            // 建立两个流的对象,绑定数据源和数据目的
            fis = new FileInputStream("e:\\abc\\b.txt");
            fos = new FileOutputStream("e:\\abc\\a\\b.txt");
            // 字节输入流,读取1个字节,输出流写1个字节
            int len = 0;
            while ((len = fis.read()) != -1){
                fos.write(len);
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
                        throw new RuntimeException("释放资源失败");
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
    }
}
