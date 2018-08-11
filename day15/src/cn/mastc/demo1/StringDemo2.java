package cn.mastc.demo1;

/**
 * @Author: XuJin_L
 * @Description: String类构造方法
 *                String类的构造方法,加重载形式
 * @Date: Created in 20:27 2018/8/11
 * @Modified By:
 */
public class StringDemo2 {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
    }
    /**
     * 定义方法,String类的构造方法
     * String(byte[] bytes) 传递字节数组
     * 通过使用平台的默认字符集解码指定的byte 数组,构造一个新的String
     * 平台: 机器操作系统
     * 默认字符集: 操作系统中的默认编码表, 默认编码表GBK
     * 将字符数组中的每个字节,查询了编码表,得到的结果
     * 字节是负数,汉字的字节编码就是负数
     */
    public static void function(){
        byte[] bytes = {97, 98, 99, 100};
        // 调用String类的构造方法,传递字节数组
        String s = new String(bytes);
        System.out.println(s);
    }
    /**
     * String类的构造方法
     * String (byte[] bytes, int offset, int length) 传递字节数组
     * 字节数组的一部分转成字符串
     * offset 数组的起始索引
     * length 个数,转几个
     */
    public static void function_1(){
        byte[] bytes = {65,66,67,68};
        String s = new String(bytes, 1, 2);
        System.out.println(s);
    }
    /**
     * String(char[] value) 传递字符数组
     * 将字符数组,转成字符串,字符数组的参数,不查询编码表
     *
     * String(char[] value, int offset, int count) 传递字符数组
     * 将字符数组的一部分转成字符串
     * offset 数组开始索引
     * count 个数
     */
    public static void function_2(){
        char[] ch = {'a','b','c','d','e','f'};
        // 调用String构造方法,传递字符数组
        String s = new String(ch);
        System.out.println(s);

        String s1 = new String(ch, 1, 4);
        System.out.println(s1);
    }
}
