package cn.mastc.demo2;

/**
 * @Author: XuJin_L
 * @Description: StringBuffer类方法
 * @Date: Created in 13:02 2018/8/12
 * @Modified By:
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
        function_3();
        function_4();
        function_5();
    }
    /**
     * StringBuffer类方法
     * append, 将任意类型数据,添加缓冲区
     * 返回值类型 StringBuffer
     * append 返回值,写return this
     * 调用者是谁,返回值就是谁
     */
    public static void function(){
        StringBuffer sb = new StringBuffer();
        // 调用StringBuffer方法append向缓冲区追加内容
        sb.append(6);
        System.out.println(sb);
    }
    /**
     * StringBuffer类方法
     *   delete(int start, int end) 删除缓冲区中字符串
     *   开始索引包含,结尾索引不包含
     */
    public static void function_1(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");

        sb.delete(1, 3);
        // sb.delete(0, sb.length());
        System.out.println(sb);
    }
    /**
     * StringBuffer类方法
     *   insert(int index, 任意类型)
     *   将任意类型数据,插入到缓冲区的指定索引上
     */
    public static void function_2(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");

        sb.insert(2, 2.5);
        System.out.println(sb);
    }
    /**
     * StringBuffer类方法
     *   replace(int start, int end, String str)
     *   将指定的索引范围内的所有字符,替换成新的字符串
     */
    public static void function_3(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");

        sb.replace(1, 4, "Q");
        System.out.println(sb);
    }
    /**
     * StringBuffer类方法
     *   reverse() 将缓冲区的字符反转
     */
    public static void function_4(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");

        sb.reverse();
        System.out.println(sb);
    }
    /**
     * StringBuffer类方法
     *   toString() 继承Object,重写toString()
     *   返回值类型String
     */
    public static void function_5(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");
        sb.append(123456);

        // 将可变的字符串缓冲区对象,变成了不可变String对象
        String s = sb.toString();
        System.out.println(s);
    }
}
