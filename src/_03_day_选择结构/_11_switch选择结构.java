package _03_day_选择结构;

import java.util.Scanner;

public class _11_switch选择结构 {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch(score/10) {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
            case 6:
                System.out.println("中");
                break;
            case 5:
            case 4:
            case 3:
            case 1:
                System.out.println("差");
                break;
            default:
                System.out.println("输入有误");
                break;
        }

    }
}
