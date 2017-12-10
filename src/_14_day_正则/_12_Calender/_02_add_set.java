package _14_day_正则._12_Calender;

import java.util.Calendar;

public class _02_add_set {
    /*
* A:成员方法
    * public void add(int field,int amount)
    * public final void set(int year,int month,int date)
* B:案例演示
    * Calendar类的成员方法使用
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,-1);    // 对指定字段进行加或者减
        System.out.println(c.get(Calendar.YEAR));//2016

        c.set(Calendar.YEAR,2000);  //修改指定字段
        System.out.println(c.get(Calendar.YEAR));//2000

        c.set(2018,1,1);
        System.out.println(c.get(Calendar.YEAR));

    }
}
