package _17_day_HashSet_TreeSet._03_练习;

import java.util.HashSet;
import java.util.Scanner;

public class _02_去掉输入中的重复 {
    /*
    * 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
    * aaaabbbcccddd

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //创建键盘录入对象
        System.out.println("请输入一行字符：");
        String line = sc.nextLine();                //将键盘录入的字符串存储在line中
        char[] arr = line.toCharArray();            //将字符串转换成字符数组
        HashSet<Character> hs = new HashSet<>();    //创建HashSet集合对象
        for (char c : arr) {                        //遍历字符数组
            hs.add(c);                              //将字符数组中的字符添加到集合中
        }
        StringBuffer sb = new StringBuffer();
        for (Character c : hs) {
            sb.append(c);
        }
        String s1 = sb.toString();
        System.out.println(s1);
    }
}
