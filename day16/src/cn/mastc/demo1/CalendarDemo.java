package cn.mastc.demo1;

import java.util.Calendar;

/**
 * @Author: XuJin_L
 * @Description: 日历类 java.util.Calendar
 *                 抽象类,使用他的子类对象
 *
 *                 Calendar类写了静态方法getInstance() 直接返回了子类的对象
 *                 不需要直接new 子类的对象,通过静态方法直接获取
 * @Date: Created in 20:34 2018/8/12
 * @Modified By:
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }

}
