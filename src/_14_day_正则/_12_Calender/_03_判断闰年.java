package _14_day_正则._12_Calender;

import java.util.Calendar;
import java.util.Scanner;

public class _03_判断闰年 {
    /*
    * 需求：键盘录入任意一个年份，判断该年是闰年还是平年
    * 分析：
    * 1、键盘录入Scanner
    * 2、创建Calendar对象
    * 3、通过set方法设置为那一年的3月1日
    * 4、将日向前减1
    * 5、判断日是多少天，如果是29天返回true否则返回false
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份，判断该年份是闰年还是平年：");
//        int year = sc.nextInt();
        String line = sc.nextLine();    //录入数字字符串
        int year = Integer.valueOf(line);
        boolean b = getYear(year);
        System.out.println(b);
    }

    //判断是否为闰年
    private static boolean getYear(int year) {
        Calendar c = Calendar.getInstance();

        //设置为那一年的3月1日
        c.set(year,2,1);

        //将日向前减1
        c.add(Calendar.DAY_OF_MONTH,-1);

        //判断是否是29天
        return c.get(Calendar.DAY_OF_MONTH) == 29;
    }
}
