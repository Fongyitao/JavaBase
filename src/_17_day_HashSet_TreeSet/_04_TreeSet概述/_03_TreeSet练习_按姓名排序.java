package _17_day_HashSet_TreeSet._04_TreeSet概述;

import java.util.TreeSet;

public class _03_TreeSet练习_按姓名排序 {
    public static void main(String[] args) {
        TreeSet<Human> ts = new TreeSet<>();
        ts.add(new Human("Zero",23));
        ts.add(new Human("Zero",23));
        ts.add(new Human("Ben",21));
        ts.add(new Human("Ben",21));
        ts.add(new Human("Alice",24));
        ts.add(new Human("Alice",24));
        ts.add(new Human("Tom",30));

        System.out.println(ts);

    }

}
