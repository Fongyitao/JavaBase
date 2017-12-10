package _15_day_Collection._06_集合的遍历之迭代器遍历Iterator;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 集合的遍历之迭代器遍历Iterator {
    /*
* A:迭代器概述
    * 集合是用来存储元素,存储的元素需要查看,那么就需要迭代(遍历)
     */

    public static void main(String[] args) {

//        demo1();
        Collection c = new ArrayList();
        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        c.add(new Student("赵六",26));

        //获取迭代器
        Iterator it = c.iterator();

        //遍历集合
        while (it.hasNext()){
            Student s = (Student)it.next(); // 向下转型
            System.out.println(s.getName() + "," + s.getAge());
        }

    }

    private static void demo1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Iterator it = c.iterator();         //获取迭代器的引用
        while(it.hasNext()) {               //集合中的迭代方法(遍历)
            System.out.println(it.next());
        }
    }
}
