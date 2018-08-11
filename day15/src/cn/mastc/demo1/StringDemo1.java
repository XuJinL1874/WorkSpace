package cn.mastc.demo1;

/**
 * @Author: XuJin_L
 * @Description:
 * @Date: Created in 15:04 2018/8/11
 * @Modified By:
 */
public class StringDemo1 {
    public static void main(String[] args) {
        // 字符串定义方式2个,直接=  使用String类的构造方法
        String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

        // 引用数据类型,比较对象地址 false
        System.out.println(str1 == str2);
        // true
        System.out.println(str1.equals(str2));
    }
}
