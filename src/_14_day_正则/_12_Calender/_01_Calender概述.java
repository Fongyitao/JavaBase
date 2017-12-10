package _14_day_正则._12_Calender;

import java.util.Calendar;

public class _01_Calender概述 {
    /*
* A:Calendar类的概述
    * Calendar 类是一个抽象类，它为特定瞬间与一组
    * 诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，
    * 并为操作日历字段（例如获得下星期的日期）提供了一些方法。
* B:成员方法
    * public static Calendar getInstance()
    * public int get(int field)
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        //System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));//2017 通过字段获取年
        System.out.println(c.get(Calendar.MONTH));//9  通过字段获取月，但是月是从0开始编号的
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//2 通过字段获取日
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//2 周日是第一天，周六是第七天，今天周一所以是第二天

        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" +
                c.get(Calendar.DAY_OF_MONTH) + "日 "
                + getWeek(c.get(Calendar.DAY_OF_WEEK)));//2017年10月2日 星期一

        //需求：显示为2017年10月02日 星期一
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" +
                getNum(c.get(Calendar.DAY_OF_MONTH)) + "日 "
                + getWeek(c.get(Calendar.DAY_OF_WEEK)));//2017年10月02日 星期一

    }

    /*
    将星期存储表中进行查表
    1、返回值类型String
    2、参数列表int week
     */
    public static String getWeek(int week) {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        return arr[week];
    }

    /*
    如果是个位数字前面补0
    1、返回值类型String
    2、参数列表，int num
     */
    public static String getNum(int num){
        /*
        if(num>9) {
            return "" + num;
        }else {
            return "0"+num;
        }
        */
        return num > 9 ? "" + num : "0" + num;

    }


}
