package _14_day_正则._11_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 你来到这个世界多少天 {
    //需求：算一下你来到这个世界多少天?
    /*
    分析：
    1、将生日字符串和今天字符串存在String类型的变量中
    2、定义日期格式化对象
    3、将日期字符串转换成日期对象
    4、通过日期对象获取时间毫秒值
    5、将两个时间毫秒值相减
    6、将毫秒值转成天单位
     */
    public static void main(String[] args) throws ParseException {

        String birthday = "1989-12-17 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bd = sdf.parse(birthday);
        Date dn = new Date();
        long time = dn.getTime() - bd.getTime();
        long l = time/1000/60/60/24;
        System.out.println(l);//10151天
    }
}
