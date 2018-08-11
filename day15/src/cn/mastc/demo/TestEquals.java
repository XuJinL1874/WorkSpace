package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description:
 * @Date: Created in 13:34 2018/8/11
 * @Modified By:
 */
public class TestEquals {
    public static void main(String[] args) {
        // Person类继承Object类,继承下来了父类的方法equals
        Person p1 = new Person("李四", 25);
        Person p2 = new Person("张三", 20);

        /**
         * this == obj;     引用类型 == 比较对象内存的地址
         * p1 == p2;        内存地址不同返回false
         */
        // Person对象p1,调用父类的方法equals,进行对象的比较
        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
