package _03_day_选择结构;

import java.util.Scanner;

public class _08_if选择结构 {
    public static void main(String[] args) {
        System.out.print("input your score:");
        Scanner sc = new Scanner(System.in);
		/*键盘录入一个成绩，判断并输出成绩等级
		 * 90-100	优
		 * 80-89	良
		 * 70-79	中
		 * 60-69	合
		 * 0-59		差
		 */
        double score = sc.nextDouble();
        if (score >= 0 && score < 60) {
            System.out.println('差');
        } else if (score < 70) {
            System.out.println('合');
        } else if (score < 80) {
            System.out.println('中');
        } else if (score < 90) {
            System.out.println('良');
        } else if (score <= 100) {
            System.out.println('优');
        } else {
            System.out.println("输入非法");
        }

    }
}
