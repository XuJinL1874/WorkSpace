package cn.mastc.demo4;

import java.math.BigDecimal;

/**
 * @Author: XuJin_L
 * @Description:
 * @Date: Created in 14:34 2018/8/14
 * @Modified By:
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        /**
         * 计算结果,未知
         * 原因: 计算机二进制中,表示浮点数不精确造成
         * 超级大型的浮点数据,提供高精度的浮点运算,BigDecimal
         */
        // 0.09999999999999999
        System.out.println(0.09 + 0.01);
        // 0.6799999999999999
        System.out.println(1.0 - 0.32);
        // 101.49999999999999
        System.out.println(1.015 * 100);
        // 0.013009999999999999
        System.out.println(1.301 / 100);

        function();
        function_1();
    }
    /**
     * BigDecimal实现三则运算
     * + - *
     */
    public static void function() {
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");

        BigDecimal bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        BigDecimal bigSub = b1.subtract(b2);
        System.out.println(bigSub);

        BigDecimal bigMul = b1.multiply(b2);
        System.out.println(bigMul);
    }
    /**
     * BigDecimal 实现除法运算
     * divide(BigDecimal divisor, int scale, int roundingMode)
     * int scale     保留几位小数
     * int roundingMode    保留模式
     */
    public static void function_1() {
        BigDecimal b1 = new BigDecimal("1.301");
        BigDecimal b2 = new BigDecimal("100");
        BigDecimal bigDiv = b1.divide(b2);
        System.out.println(bigDiv);
    }
}
