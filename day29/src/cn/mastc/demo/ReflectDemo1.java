package cn.mastc.demo;

import java.lang.reflect.Constructor;

/**
 * @Author: X_JinL
 * @Description: 通过反射获取class文件中的构造方法,运行构造方法
 *                运行构造方法,创建对象
 *                      1. 获取class文件对象
 *                      2. 从class文件对象中,获取需要的成员
 *
 *                 Constructor 描述构造方法对象类
 * @Date: Created in 16:13 2018/8/15
 * @Modified By:
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("cn.mastc.demo.Person");
        // 使用class文件对象,获取类中的构造方法
        /*// Constructor[]    getConstructor() 获取class文件对象中的公共的构造方法
        Constructor[] cons = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/
        // 获取指定的构造方法,空参数的构造方法
        Constructor con = c.getConstructor();
        // 运行空参数的构造方法,Constructor类方法newInstance()运行获取到的构造方法
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
