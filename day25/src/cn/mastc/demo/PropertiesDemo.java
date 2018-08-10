package cn.mastc.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: XuJin_L
 * @Description: 集合对象Properties类,继承HashTable,实现Map接口
 *                可以和IO对象结合使用,实现数据的持久存储
 * @Date: Created in 13:07 2018/8/10
 * @Modified By:
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException{
        function_2();
    }
    /**
     * 使用Properties集合,存储键值对
     * setProperty等同于Map接口中的put
     * setProperty(String key, String value)
     * 通过键获取值, getProperty(String key)
     */
    public static void function(){
        Properties pro = new Properties();
        pro.setProperty("a", "1");
        pro.setProperty("b", "2");
        pro.setProperty("c", "3");
        System.out.println(pro);

        String value = pro.getProperty("c");
        System.out.println(value);

        // 方法stringPropertyNames, 将集合中的键存储到Set集合,类似于Map接口的方法keySet
        Set<String> set = pro.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"..."+pro.getProperty(key));
        }
    }
    /**
     * Properties集合特有方法load
     * load(InputStream in)
     * load(Reader r)
     * 传递任意的字节或者字节输入流
     * 流对象读取文件中的键值对,保存到集合
     */
    public static void function_1()throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("e:\\pro.properties");
        // 调用集合的方法load,传递字符输入流
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }
    /**
     * Properties集合特有的方法store
     * store(OutputStream out)
     * store(Writer w)
     * 接收所有的字节或者字符的输出流,将集合中的键值对,写回文件中保存
     */
    public static void function_2()throws IOException{
        Properties pro = new Properties();
        pro.setProperty("name", "zhangsan");
        pro.setProperty("age", "31");
        pro.setProperty("email", "123456789@163.com");
        FileWriter fw = new FileWriter("e:\\pro.properties");
        // 键值对,存回文件,使用集合的方法store传递字符输出流
        pro.store(fw, "abc");
        fw.close();
    }
}
