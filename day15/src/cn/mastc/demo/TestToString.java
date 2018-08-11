package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: Test toString
 * @Date: Created in 14:15 2018/8/11
 * @Modified By:
 */
public class TestToString {
    public static void main(String[] args) {
        // 调用Perosn类的方法toString()
        // 输出语句中,写的是一个对象,默认调用对象的toString()方法
        Person p = new Person("张三", 20);
        String s = p.toString();
        System.out.println(p);
        System.out.println(s);
        /**
         * System.out.println(p);
         * System.out.println(p.toString());
         */
    }
}
