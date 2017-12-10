package _14_day_正则._10_Date类;

import java.util.Date;

public class Date类 {
    /*
* A:Date类的概述
    * 类 Date 表示特定的瞬间，精确到毫秒。
* B:构造方法
    * public Date()
    * public Date(long date)
* C:成员方法
    * public long getTime()
    * public void setTime(long time)
     */
    public static void main(String[] args) {

//        demo1();
//        demo2();
//        demo3();

    }

    private static void demo3() {
        Date d1 = new Date();
        d1.setTime(1000);       // 设置毫秒值，改变时间对象
        System.out.println(d1);//Thu Jan 01 08:00:01 CST 1970
    }

    private static void demo2() {
        Date d2 = new Date(0);  // 如果构造方法中参数传0，代表1970年1月1日 00:00:00 只不过我们是时区是东八区所以显示08:00:00
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970
    }

    private static void demo1() {
        Date d1 = new Date();//没有参数表示当前时间
        System.out.println(d1);//Mon Oct 02 21:16:51 CST 2017

        System.out.println(System.currentTimeMillis());//1506950762363  通过系统类方法获取当前毫秒值
        System.out.println(d1.getTime());//1506950762281    通过时间对象获取毫秒值
    }
}
