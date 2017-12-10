package _14_day_正则._11_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat类 {
    /*
* A:DateFormat类的概述
    * DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
    * 是抽象类，所以使用其子类SimpleDateFormat
* B:SimpleDateFormat构造方法
    * public SimpleDateFormat()
    * public SimpleDateFormat(String pattern)
* C:成员方法
    * public final String format(Date date)
    * public Date parse(String source)
     */
    public static void main(String[] args) throws ParseException {

        //DateFormat 是抽象类，不允许实例化

        //DateFormat df1 = new SimpleDateFormat();
        //DateFormat df1 = DateFormat.getDateInstance(); // 相当于父类引用指向子类对象，右边返回一个子类对象

//        demo1();
//        demo2();

        //将时间字符串转换成日期对象
        String s = "1990年10月02日 08:08:08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(s); //将时间对象转换成日期对象
        System.out.println(d);//Tue Oct 02 08:08:08 CST 1990
    }

    private static void demo2() {
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM年dd日 HH:MM:ss");
        System.out.println(sdf1.format(d));//2017年10年02日 21:10:51
    }

    private static void demo1() {
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat();// 创建日期格式化对象
        System.out.println(sdf1.format(d));//2017/10/2 下午9:42
    }
}
