package _17_day_HashSet_TreeSet._06_练习;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class _02_对键盘输入排序 {
    /*
* 从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloitcast程序打印:acehillostt

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串，我们会对其排序：");

        String line = sc.nextLine();
        TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int num = o1.compareTo(o2);
                return num == 0? 1:num;
            }
        });

        char[] arr = line.toCharArray();
        for (char c : arr) {
            ts.add(c);
        }

        System.out.println(ts);

    }
}
