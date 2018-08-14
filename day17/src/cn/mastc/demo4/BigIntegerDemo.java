package cn.mastc.demo4;

import java.math.BigInteger;

/**
 * @Author: XuJin_L
 * @Description: 超级大的整数运算
 *                   超过long取值范围的整数,封装成BigInteger类型的对象
 * @Date: Created in 14:08 2018/8/14
 * @Modified By:
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        function();
        function_1();
    }
    /**
     * BigInteger类的构造方法
     * 传递字符串,要求数字格式,没有长度限制
     */
    public static void function() {
        BigInteger b = new BigInteger("97979797979797979797979797979797979797979797979797");
        System.out.println(b);
        BigInteger b1 = new BigInteger("12345678997979797979797979797979797979797979797979797979797");
        System.out.println(b1);
    }
    /**
     * BigInteger对象的四则运算
     * 调用方法计算,计算结果也只能是BigInteger对象
     */
    public static void function_1() {
        BigInteger b1 = new BigInteger("164833192164833192164833192");
        BigInteger b2 = new BigInteger("350725681350725681350725681350725681");

        // 计算b1+b2对象的和,调用方法add
        BigInteger bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        // 计算b1-b2对象的差,调用方法subtract
        BigInteger bigSub = b1.subtract(b2);
        System.out.println(bigSub);

        // 计算b1*b2对象的积,调用方法multiply
        BigInteger bigMul = b1.multiply(b2);
        System.out.println(bigMul);

        // 计算b2/b1对象的商,调用方法divide
        BigInteger bigDiv = b2.divide(b1);
        System.out.println(bigDiv);
    }
}
