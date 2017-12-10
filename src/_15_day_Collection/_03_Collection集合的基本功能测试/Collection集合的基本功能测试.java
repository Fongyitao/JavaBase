package _15_day_Collection._03_Collection集合的基本功能测试;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Collection集合的基本功能测试 {
    /*
* A:案例演示
*
        基本功能演示

        boolean add(E e)
        boolean remove(Object o)
        void clear()
        boolean contains(Object o)
        boolean isEmpty()
        int size()

* B:注意:
*
        collectionXxx.java使用了未经检查或不安全的操作.
        注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
        java编译器认为该程序存在安全隐患
        温馨提示:这不是编译失败,所以先不用理会,等学了泛型你就知道了

  add方法如果是list集合一直都返回true，因为list集合中可以存储重复元素的
  如果是set集合当存储重复元素时，就会返回false

  ArrayList的父类的父类重写toString方法
     */

    public static void main(String[] args) {

//        demo_add();
        Collection c = new ArrayList(); //父类引用指向子类对象
        c.add("a");
        c.add("b");
        c.add("c");

        c.remove("b");
        System.out.println(c);//[a, c]  删除指定元素

        boolean b1 = c.contains("a");   //是否包含
        System.out.println(b1);//true
        boolean b2 = c.contains("b");
        System.out.println(b2);//false

        c.clear();
        System.out.println(c);//[]   清空元素

        System.out.println(c.isEmpty());//true      判断是否为空

        c.add(100);
        c.add(true);
        System.out.println(c.size());//2    获取元素个数

    }

    private static void demo_add() {
        Collection c = new ArrayList(); //父类引用指向子类对象
        boolean b1 = c.add("abc");
        boolean b2 = c.add(true);   //自动装箱，new Boolean(true);
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student("张三",13));
        System.out.println(b1);//true
        System.out.println(b2);//true
        System.out.println(b3);//true
        System.out.println(b4);//true
        boolean b5 = c.add("abc");
        System.out.println(b5);//true

        System.out.println(c);//[abc, true, 100, Student{name='张三', age=13}, abc]
    }
}
