package _17_day_HashSet_TreeSet._04_TreeSet概述;

import java.util.TreeSet;

public class _01_TreeSet存储Integer类型的元素并遍历 {
    /*
    * A:案例演示
    * TreeSet存储Integer类型的元素并遍历
    *
    * TreeSet集合是用来对元素进行排序的，同样它也可以保证元素的唯一性
     */
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(3);
        ts.add(5);
        ts.add(5);
        ts.add(2);
        ts.add(2);
        ts.add(1);
        ts.add(1);

        for (int i : ts) {
            System.out.println(i);
        }
        /*
        1
        2
        3
        5
         */
    }
}
