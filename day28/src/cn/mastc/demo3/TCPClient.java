package cn.mastc.demo3;

/**
 * @Author: XuJin_L
 * @Description: 实现TCP图片上传客户端
 *                实现步骤:
 *                      1. Socket套接字连接服务器
 *                      2. 通过socket获取字节输出流,写图片
 *                      3. 使用自己的流对象,读取图片数据源
 *                          FileInputStream
 *                      4. 读取图片,使用字节输出流,将图片写到服务器
 *                          采用字节数组进行缓冲
 *                      5. 通过Socket套接字获取字节输入流
 *                          读取服务器发送回来的上传成功
 *                      6. 关闭资源
 * @Date: Created in 23:12 2018/8/14
 * @Modified By:
 */
public class TCPClient {
    public static void main(String[] args) {

    }
}
