package _03_day_选择结构;

import java.util.Scanner;

public class _09_if选择结构 {
    public static void main(String[] args) {
		/*
		 * 键盘录入x的值，计算出y的值并输出
		 * x >= 3	y = 2*x + 1;
		 * -1<x<3	y = 2*x;
		 * x <=-1	y = 2*x -1;
		 */
        Scanner sc = new Scanner(System.in);
        System.out.print("input x value:");
        int x = sc.nextInt();
        int y = 0;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x > -1) {
            y = 2 * x;
        } else if (x <= -1) {
            y = 2 * x - 1;
        }
        System.out.println("y = " + y);
    }
}
