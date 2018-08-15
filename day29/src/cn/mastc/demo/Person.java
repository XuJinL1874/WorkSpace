package cn.mastc.demo;

/**
 * @Author: X_JinL
 * @Description:
 * @Date: Created in 15:51 2018/8/15
 * @Modified By:
 */
public class Person {
    public String name;
    private int age;


	/*static{
		System.out.println("静态代码块");
	}*/

    public Person(){
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    private Person(int age,String name){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(String s, int a,double d){
        System.out.println("人在睡觉"+s+"....."+a+"....."+d);
    }
    private void playGame(){
        System.out.println("人在打游戏");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
