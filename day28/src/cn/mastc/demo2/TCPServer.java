package cn.mastc.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: XuJin_L
 * @Description:  实现TCP服务器程序
 *                 表示服务器程序类: java.net.ServerSocket
 *                 构造方法:
 *                    ServerSocket(int port) 传递端口号
 *
 *                 很重要的事情: 必须获取客户端的套接字对象Socket
 *                      Socket accept()
 * @Date: Created in 22:34 2018/8/14
 * @Modified By:
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        // 调用服务器套接字对象中的方法accept() 获取客户端套接字对象
        Socket socket = server.accept();
        // 通过客户端套接字对象,socket获取字节输入流,读取的是客户端发送来的数据
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data, 0, len));

        // 服务器向客户端回数据,字节输入流,通过客户端套接字对象获取字节输入流
        OutputStream out = socket.getOutputStream();
        out.write("收到,谢谢".getBytes());
        socket.close();
        server.close();
    }
}
