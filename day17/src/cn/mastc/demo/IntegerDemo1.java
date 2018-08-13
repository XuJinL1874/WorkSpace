package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: Integer类中的其他方法
 *                包括三个方法,和两个静态成员变量
 * @Date: Created in 20:39 2018/8/13
 * @Modified By:
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        function();
        function_1();
    }
    /**
     * Integer类的静态成员变量
     * MAX_VALUE
     * MIN_VALUE
     */
    public static void function() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    /**
     * Integer类的3个静态方法
     * 做进制的转换
     * 十进制转二进制 toBinaryString(int)
     * 十进制转八进制 toOctalString(int)
     * 十进制转十六进制 toHexString(int)
     */
    public static void function_1() {
        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toOctalString(99));
        System.out.println(Integer.toHexString(99));
    }
}
