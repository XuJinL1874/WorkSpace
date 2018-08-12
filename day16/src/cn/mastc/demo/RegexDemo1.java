package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: 正则表达式
 * @Date: Created in 16:09 2018/8/12
 * @Modified By:
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        split();
        split_1();
        split_2();
        replaceAll();
    }
    /**
     * String类方法split对字符串进行切割
     * 12-25-36-98 按照-对字符串进行切割
     */
    public static void split(){
        String str = "12-25-36-95";
        // 按照-对字符串进行切割,String方法split
        String[] strArr = str.split("-");
        for (int i = 0; i< strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
    /**
     * String类方法split对字符串进行切割
     * 18 22 40 65 按照空格切割字符串
     */
    public static void split_1(){
        String str = "18    22           40    65";
        String[] strArr = str.split(" +");
        for (int i = 0; i< strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
    /**
     * String类方法split对字符串进行切割
     *   192.168.105.27 按照点切割字符串
     */
    public static void split_2(){
        String ip = "192.168.105.27";
        String[] strArr = ip.split("\\.");
        System.out.println("数组长度"+strArr.length);
        for (int i = 0; i< strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
    /**
     * "Hello123456World456789" 将所有数组替换掉
     * String类方法replaceAll(正则规则, 替换后的新字符串)
     */
    public static void replaceAll(){
        String str = "Hello123456World456789";
        str = str.replaceAll("[\\d+]", "#");
        System.out.println(str);
    }
}
