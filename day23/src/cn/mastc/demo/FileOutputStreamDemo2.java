package cn.mastc.demo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: XuJin_L
 * @Description: IO流的异常处理
 *                try catch finally
 *
 *                细节:
 *                  1. 保证流对象的变量,作用域足够
 *                  2. catch里面怎么处理异常
 *                       输出异常的信息,目的看到哪里出现异常
 *                       停下程序,重新尝试
 *                  3.如果流对象建立失败了,需要关闭资源吗
 *                      new对象的时候失败了,没有占用系统资源
 *                      释放资源的时候,对流对象判断null
 *                      变量不是null,对象建立成功,需要关闭资源
 * @Date: Created in 20:45 2018/8/7
 * @Modified By:
 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        // try 外面声明变量,try 里面建立对象
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("e:\\abc");
            fos.write(100);
        }catch(IOException e){
            System.out.println(e.getMessage());
            throw   new RuntimeException("文件写入失败,请重试");
        }finally{
            try {
                if (fos != null) {
                    fos.close();
                }
            }catch(IOException e){
                throw   new RuntimeException("关闭资源失败");
            }
        }
    }
}
