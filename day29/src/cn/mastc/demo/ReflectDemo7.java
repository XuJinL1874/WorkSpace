package cn.mastc.demo;

import java.lang.reflect.Method;

/**
 * @Author: X_JinL
 * @Description: 反射获取有参数的成员方法并执行
 *                public void sleep(String, int, double){}
 * @Date: Created in 14:10 2018/8/16
 * @Modified By:
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("cn.mastc.demo.Person");
        Object obj = c.newInstance();
        // 调用Class类的方法getMethod()获取指定的方法sleep
        Method method = c.getMethod("sleep", String.class, int.class, double.class);
        // 调用Method类的方法invoke()运行sleep方法
        method.invoke(obj, "休眠", 100, 199.99);
    }
}
