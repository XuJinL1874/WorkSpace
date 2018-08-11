package cn.mastc.demo1;

/**
 * @Author: XuJin_L
 * @Description: String类的查找功能
 * @Date: Created in 21:07 2018/8/11
 * @Modified By:
 */
public class StringDemo3 {
    public static void main(String[] args) {
        function();
        function_1();
        function_3();
        function_4();
        function_5();
        function_6();
        function_7();
        function_8();
        function_9();
    }
    /**
     * int length() 返回字符串的长度
     * 包含多少个字符
     */
    public static void function(){
        String str = "sasdsfsaaaaaadas";
        int length = str.length();
        System.out.println(length);
    }
    /**
     * String substring(int beginIndex, int endIndex) 获取字符串的一部分
     *包含头,不包含尾
     *
     * String substring(int beginIndex) 获取字符串的一部分
     * 包含头,后面的字符全要
     */
    public static void function_1(){
        String str = "HelloWorld";
        str = str.substring(1, 5);
        System.out.println(str);

        String str1 = "WelcomeYou";
        System.out.println(str1.substring(1));
    }
    /**
     * boolean startsWith(String prefix)
     * 测试此字符串是不是以指定的前缀开始
     */
    public static void function_3(){
        String str = "helloWorld";
        boolean b = str.startsWith("h");
        System.out.println(b);
    }
    /**
     * boolean endsWith(String prefix)
     * 测试此字符串是不是以指定的后缀结束
     */
    public static void function_4(){
        String str = "helloWorld";
        boolean b = str.endsWith("h");
        System.out.println(b);
    }
    /**
     * boolean contains(String s)
     * 判断一个字符串中,是否包含另一个字符串
     */
    public static void function_5(){
        String s = "helloWorld";
        boolean b = s.contains("h");
        System.out.println(b);
    }
    /**
     * int indexOf(char ch)
     * 查找一个字符,在字符串中第一次出现的索引
     * 被查找的字符不存在,返回-1
     */
    public static void function_6(){
        String s = "helloWorld";
        int index = s.indexOf('e');
        System.out.println(index);
    }
    /**
     * byte[] getBytes() 将字符串转换成字节数组
     * 此功能和String构造法相反
     * byte数组相关的功能,查询编码表
     */
    public static void function_7(){
        String s = "abc";
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }
    }
    /**
     * char[] toCharArray() 将字符串转成字符数组
     * 功能和构造方法相反
     */
    public static void function_8(){
        String s = "helloWorld";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
    }
    /**
     * boolean equals(Object obj)
     * 方法传递字符串,判断字符串中的字符是否完全相同,如果完全相同返回true
     *
     * boolean equalsIgnoreCase(String s)
     * 传递字符串,判断字符串中的字符是否相同,忽略大小写
     */
    public static void function_9(){
        String str1 = "Abc";
        String str2 = "abc";
        boolean b1 = str1.equals(str2);
        boolean b2 = str2.equalsIgnoreCase(str2);
        System.out.println(b1);
        System.out.println(b2);
    }
}