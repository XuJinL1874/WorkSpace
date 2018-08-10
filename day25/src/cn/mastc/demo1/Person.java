package cn.mastc.demo1;

import java.io.Serializable;

/**
 * @Author: XuJin_L
 * @Description: private transient(瞬态关键字: 阻止成员序列化) int age; 不能序列化
 * @Date: Created in 14:42 2018/8/10
 * @Modified By:
 */
public class Person implements Serializable {
    private String name;
    private int age;
    // public int age;
    // 类,自定义了序列号,编译器不会计算序列号
    private static final long serialVersionUID = 32L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
