package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: Integer类,封装基本数据类型int,提高大量方法
 *                将字符串转成基本数据类型int
 * @Date: Created in 13:01 2018/8/13
 * @Modified By:
 */
public class IntegerDemo {
    public static void main(String[] args) {
        function();
    }
    /**
     * Integer类中静态方法parseInt(String s) 返回基本数据类型
     * 要求: 字符串必须是数字格式的
     */
    public static void function() {
        int i = Integer.parseInt("12");
        System.out.println(i);
    }
}
