package _16_day_泛型._04_泛型_generic_概述;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class _02_泛型之存储字符串 {
    /*
* A:案例演示
    * ArrayList存储字符串并遍历泛型版
     */
    public static void main(String[] args) {
        demo1();// 泛型存储字符串

        demo2();//  泛型存储自定义类

    }

    private static void demo2() {
        ArrayList<Student> list =  new ArrayList<>();
        list.add(new Student("Tony",18));
        list.add(new Student("Jack",22));
        list.add(new Student("Ryan",17));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        /*
        Tony,18
        Jack,22
        Ryan,17
         */
    }

    private static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + "\t");
        }
        System.out.println();
        //  a	b	c	d
    }
}
