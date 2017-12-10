package _17_day_HashSet_TreeSet._02_LinkedHashSet的概述和使用;

import java.util.LinkedHashSet;

public class LinkedHashSet的概述和使用 {
    /*
* A:LinkedHashSet的特点
* B:案例演示
    * LinkedHashSet的特点
    * 底层是链表实现，是Set集合中唯一一个能保证怎么存就怎么取得集合对象
        * 可以保证怎么存就怎么取
        * 可以保证元素唯一

     */

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("c");

        System.out.println(lhs);//[a, b, c]
    }
}
