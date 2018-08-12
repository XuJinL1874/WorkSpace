package cn.mastc.demo;

/**
 * @Author: XuJin_L
 * @Description: 正则表达式
 *                   实现正则规则和字符串进行匹配,使用到字符串类的方法
 *                   String类三个和正则表达式相关的方法
 *                      boolean matches(String 正则的规则)
 *                      "abc".matches("[a]") 匹配成返回true
 *
 *                      String[] split(String 正则的规则)
 *                      "abc".split("a") 使用规则将字符串进行切割
 *
 *                      String replaceAll(String 正则规则, String 字符串)
 *                      "abc123".replaceAll("[\\d]", "#")
 *                      按照正则规则,替换字符串
 * @Date: Created in 15:08 2018/8/12
 * @Modified By:
 */
public class RegexDemo {
    public static void main(String[] args) {
        checkQQ();
        checkTel();
    }
    /**
     * 检查QQ号码是否合法
     * 0不能开头,全数字,位数5-10位
     */
    public static void checkQQ(){
        String QQ = "164833192";
        // 检查QQ号码和规则是否匹配,String类的方法matches
        boolean b = QQ.matches("[1-9][0-9]{4,9}");
        System.out.println(b);
    }
    /**
     * 检查手机号码是否合法
     * 1开头 可以说34578 0-9位数 固定11位
     */
    public static void checkTel(){
        String tel = "13195588005";
        boolean b = tel.matches("1[34578][0-9]{9}");
        System.out.println(b);
    }
}
