package cn.mastc.demo3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: X_JinL
 * @Description: TCP线程服务器
 * @Date: Created in 14:32 2018/8/15
 * @Modified By:
 */
public class TCPThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);
        while (true) {
            // 获取到一个客户端,必须开启新线程
            Socket socket = server.accept();
            new Thread(new Upload(socket)).start();
        }
    }
}
