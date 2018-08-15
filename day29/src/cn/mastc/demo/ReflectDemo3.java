package cn.mastc.demo;

/**
 * @Author: X_JinL
 * @Description: 反射获取构造方法并运行,快捷方式
 *                前提:
 *                      1. 被反射的类,必须具有空参数构造方法
 *                      2. 构造方法权限必须public
 * @Date: Created in 20:36 2018/8/15
 * @Modified By:
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("cn.mastc.demo.Person");
        // Class类中定义方法,T newInstance() 直接创建被反射类的对象实例
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
