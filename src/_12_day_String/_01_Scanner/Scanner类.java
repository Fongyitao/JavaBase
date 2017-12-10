package _12_day_String._01_Scanner;

import java.util.Scanner;

public class Scanner类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //键盘录入
        System.out.print("请输入一个整数：");

//        int i = sc.nextInt();
//        System.out.println(i);


        if (sc.hasNextInt()){
            int i = sc.nextInt();
            System.out.println(i);
        }else {
            System.out.println("输入类型错误");
        }

    }
}
