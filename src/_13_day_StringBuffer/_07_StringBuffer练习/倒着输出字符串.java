package _13_day_StringBuffer._07_StringBuffer练习;

import java.util.Scanner;

public class 倒着输出字符串 {
/*
    需求：把字符串反转
    举例：键盘录入"abc"
    输出结果："cba"

    用StringBuffer的功能实现
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 创建键盘录入对象
        System.out.print("请输入一个字符串：");
        String line = sc.nextLine();

        StringBuffer sb = new StringBuffer(line);   // 将字符串转换成StringBuffer对象

        sb.reverse();   //  将缓冲区内容反转
        String s = sb.toString();
        System.out.println(s);

    }

}
