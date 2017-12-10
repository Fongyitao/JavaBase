package _16_day_泛型._09_foreach;

import _16_day_泛型._08_泛型之通配符.Person;

import java.util.ArrayList;

public class Foreach循环 {
    /*
* A:增强for概述
    * 简化数组和Collection集合的遍历
* B:格式：
        for(元素数据类型 变量 : 数组或者Collection集合) {
            使用变量即可，该变量就是元素
        }
* C:案例演示
    * 数组，集合存储元素用增强for遍历
* D:好处
    * 简化遍历
    *
foreach依赖的是迭代器
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        //  11	22	33	44	55

        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        for (String s : list) {
            System.out.print(s + "\t");
        }
        //  a	b	c	d	e

        System.out.println();

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三",18));
        list1.add(new Person("李四",17));
        list1.add(new Person("王五",21));

        for (Person p : list1) {
            System.out.println(p);
        }
        /*
        Person{name='张三', age=18}
        Person{name='李四', age=17}
        Person{name='王五', age=21}
         */


    }
}
