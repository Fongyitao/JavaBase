package _17_day_HashSet_TreeSet._01_HashSet存储字符串并遍历;

import java.util.HashSet;

public class _01_HashSet存储字符串并遍历 {
    /*
* A:Set集合概述及特点
    * 通过API查看即可
    *
    * HashSet集合元素，无索引，不可以重复，无序（存储不一致）
* B:案例演示
    * HashSet存储字符串并遍历
    *
             HashSet<String> hs = new HashSet<>();
            boolean b1 = hs.add("a");
            boolean b2 = hs.add("a");            //当存储不成功的时候,返回false

            System.out.println(b1);
            System.out.println(b2);
            for(String s : hs) {
                System.out.println(s);
            }
     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();   //创建HashSet对象
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");   //当想Set集合中存储重复元素时，返回false
        System.out.println(b1); // true
        System.out.println(b2); // false
        System.out.println(hs); // [a]      HaseSet的继承体系中有重写toString方法

        hs.add("b");
        hs.add("c");
        hs.add("d");
        System.out.println(hs);

        //遍历
        for (String s : hs) {
            System.out.println(s);
        }

    }
}
