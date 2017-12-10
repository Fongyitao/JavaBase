package _12_day_String._14_倒着输出字符串;

import java.util.Scanner;

public class 倒序输出字符串 {
    /*
需求：把字符串反转
        举例：键盘录入"abc"
        输出结果："cba"

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        char[] arr = line.toCharArray();
        String s = "";
        for (int i = arr.length-1; i >= 0; i--) {
//            s += arr[i];                          //拼接字符串
            s = s.concat(String.valueOf(arr[i]));   //拼接字符串
        }
        System.out.println(s);
    }
}
