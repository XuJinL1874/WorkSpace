package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description:
 * @Date: Created in 13:29 2018/8/11
 * @Modified By:
 */
public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 将父类的方法equals重写过来,重写父类的方法
     * 但是,不改变父类方法的源代码,方法equals 比较两个对象的内存地址
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        return (this == obj);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
