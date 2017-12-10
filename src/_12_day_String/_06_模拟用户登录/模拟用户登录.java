package _12_day_String._06_模拟用户登录;

import java.util.Scanner;

public class 模拟用户登录 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        while (count <= 3){
            System.out.print("请输入用户名：");
            String userName = sc.nextLine();
            System.out.print("请输入密码：");
            String passwd = sc.nextLine();
            // String.trim(); 去掉首尾空格
            // String.replace(" ","");  去掉所有空格，包括首尾、中间
            if ("admin".equals(userName.trim()) && "admin".equals(passwd.replace(" ",""))){
                System.out.println("Bingo!");
                break;
            }else{
                if (count == 3){
                    System.out.println("今天3次机会已用尽，明天再试！");
                }else{
                    System.out.println("错误！还有"+(3-count)+"次机会");
                }
            }
            count ++;
        }
    }
}
