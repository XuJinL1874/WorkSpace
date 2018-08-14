package cn.mastc.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: XuJin_L
 * @Description: 表示互联网中的IP地址
 *                   java.net.InetAddress
 *                 静态方法:
 *                      static InetAddress getLocalHost()   LocalHost本地主机
 *                      返回本地主机,返回值InetAddress对象
 *
 *                      static InetAddress getByName(String hostName) 传递主机名,获取IP地址对象
 *
 *                 非静态方法:
 *                      String getHostAddress() 获取主机IP
 *                      String getHostName() 获取主机名
 * @Date: Created in 16:39 2018/8/14
 * @Modified By:
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        function();
        function_1();
    }
    /**
     * static InetAddress getLocalHost()
     */
    public static void function() throws UnknownHostException {
        InetAddress inet = InetAddress.getLocalHost();
        // 输出结果就是主机名和IP地址
        System.out.println(inet);

        String ip = inet.getHostAddress();
        String name = inet.getHostName();
        System.out.println(ip);
        System.out.println(name);
    }
    /**
     * static InetAddress getByName(String hostName) 传递主机名,获取IP地址对象
     */
    public static void function_1() throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("PC");
        System.out.println(inet);
    }
}
