package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: 正则表达式
 * @Date: Created in 16:23 2018/8/12
 * @Modified By:
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        checkMail();
    }
    /**
     * 检查邮件地址是否合法
     * 规则:
     *      164833192.qq.com
     *      mymail@sina.com
     *      nimail@163.com
     *      wodemail@yahoo.com.cn
     *
     * @ :前 数字字母_ 个数不能少于1个
     * @ :后 数字字母  个数不能少于1个
     * . :后 字母
     */
    public static void checkMail(){
        String email = "abc123@sina.com";
        boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+\\.[a-z]+");
        System.out.println(b);
    }
}
