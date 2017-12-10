package _03_day_选择结构;

import java.util.Scanner;

public class _07_键盘录入基本格式 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	//创建键盘录入对象
        System.out.print("请输入你的名字：");
        String name = sc.next();
        System.out.print("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("My name is "+ name+" and I am "+ age+" years old.");

    }
}
