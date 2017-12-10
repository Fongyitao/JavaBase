package _17_day_HashSet_TreeSet._03_练习;

import java.util.HashSet;
import java.util.Random;

public class _01_产生不重复的随机数 {
    /*
* A:案例演示
    * 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
     */
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();

        for ( ;hs.size()<10; ) {
            int num = r.nextInt(20) + 1;    // Random类中nextInt方法，随机数从0开始，故要加1
            hs.add(num);
        }
        System.out.println(hs);//[16, 2, 19, 20, 5, 6, 8, 9, 10, 13]
    }
}
