package cn.mastc.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: XuJin_L
 * @Description:
 * @Date: Created in 21:33 2018/8/12
 * @Modified By:
 */
public class TestDateDemo {
    public static void main(String[] args) throws Exception {
        function();
        function_1();
    }
    /**
     * 计算活了多少天
     *   生日 今天的日期
     *   两个日期变成毫秒值,减法
     */
    public static void function() throws Exception{
        System.out.println("请输入出生日期 格式: yyyy-MM-dd");
        // 获得出生日期
        String birthdayString = new Scanner(System.in).next();
        // 将字符串日期转成Date对象
        // 创建SimpleDateFormat对象,写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 调用方法parse,字符串转成日期对象
            Date birthdayDate = sdf.parse(birthdayString);
        // 获取今天的日期对象
        Date today = new Date();
        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = today.getTime();
        long dt = todaySecond - birthdaySecond;
        if (dt < 0){
            System.out.println("还没出生");
        }else {
            System.out.println(dt / 1000 / 60 / 60 / 24);
        }
    }
    /**
     * 闰年计算
     *   2000 3000
     *   高级的算法: 日历设置到指定年份的3月1日,add向前偏移1天,获取天数,29闰年
     */
    public static void function_1() {
        Calendar c = Calendar.getInstance();
        // 将日历设置到指定年的3月1日
        c.set(2000, 2, 1);
        // 日历add方法,向前偏移1天
        c.add(Calendar.DAY_OF_MONTH, -1);
        // get方法获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
