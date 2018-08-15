package cn.mastc.demo;

/**
 * @Author: X_JinL
 * @Description: 通过反射获取class文件中的构造方法,运行构造方法
 *                运行构造方法,创建对象
 *                      1. 获取class文件对象
 *                      2. 从class文件对象中,获取需要的成员
 * @Date: Created in 16:13 2018/8/15
 * @Modified By:
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("cn.mastc.demo.Person");
        // 使用class文件对象,获取类中的构造方法

    }
}
