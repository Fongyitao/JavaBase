package _17_day_HashSet_TreeSet._04_TreeSet概述;

import _17_day_HashSet_TreeSet._01_HashSet存储字符串并遍历.Person;

import java.util.TreeSet;

public class _02_TreeSet存储自定义对象 {
    /*
     cpmpareTo方法return 0的时候，集合中只有一个元素
     compareTo方法返回正数的时候，集合会怎么存就怎么取
     compareTo方法返回负数的时候，集合会倒序存储
     */
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三",23));
        ts.add(new Person("李四",24));
        ts.add(new Person("张三",23));
        ts.add(new Person("张三",20));

        System.out.println(ts);
        //[Person{name='张三', age=20}, Person{name='张三', age=23}, Person{name='李四', age=24}]
    }
}
