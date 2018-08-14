package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: JDK1.5后出现的新特性,自动装箱和自动拆箱
 *                自动装箱: 基本数据类型,直接变成对象
 *                自动拆箱: 对象中的数据变回基本数据类型
 *
 *                  好处: 基本类型和引用类型直接计算
 *                  弊端: 可能出现空指针异常
 * @Date: Created in 12:49 2018/8/14
 * @Modified By:
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        function();
        // function_1();
        function_2();
    }
    public static void function() {
        // 引用类型, 引用变量一定指向对象
        // 自动装箱, 基本数据类型1,直接变成了对象
        // Integer in = new Integer(1);
        Integer in = 1;
        // in 是引用类型,不能和基本类型运算,自动拆箱,引用类型in,转换基本类型
        // in+1 ==> in.Value() + 1 = 2
        in = in + 1;
        System.out.println(in.toString());
    }
    public static void function_1() {
        Integer in = null;
        // in = null.Value()+1
        in = in + 1;
        System.out.println(in);
    }
    /**
     * 关于自动装箱和拆箱一些题目
     */
    public static void function_2() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        // false 对象地址
        System.out.println(i == j);
        // true 继承Object重写equals,比较的对象数据
        System.out.println(i.equals(j));

        Integer a = 500;
        Integer b = 500;
        // false
        System.out.println(a == b);
        // true
        System.out.println(a.equals(b));

        // 数据在byte范围内, JVM不会从新new对象
        // Integer aa = new Integer(127)
        Integer aa = 127;
        // Integer bb == aa;
        Integer bb = 127;
        // ture
        System.out.println(aa == bb);
        // true
        System.out.println(aa.equals(bb));
    }
}
