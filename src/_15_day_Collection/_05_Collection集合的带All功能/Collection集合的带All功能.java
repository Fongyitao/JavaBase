package _15_day_Collection._05_Collection集合的带All功能;

import java.util.ArrayList;
import java.util.Collection;

public class Collection集合的带All功能 {
    /*
* A:案例演示
*
        带All的功能演示

        boolean addAll(Collection c)
        boolean removeAll(Collection c)
        boolean containsAll(Collection c)
        boolean retainAll(Collection c)

     */
    public static void main(String[] args) {

//        demo_addAll();    //B集合元素逐个添加到A集合中

//        demo_removeAll(); //删除交集

//        demo_containsAll(); //判断B集合是否是A集合的子集

        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("c");
        c2.add("e");

        boolean b = c1.retainAll(c2);   //求交集
        System.out.println(b);//true
        System.out.println(c1);//[a, c]


    }

    private static void demo_containsAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("d");

        boolean b = c1.containsAll(c2);// 判断B集合是否是A集合的子集
        System.out.println(b);//true
    }

    private static void demo_removeAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add(100);

        boolean b = c1.removeAll(c2);   //删除交集
        System.out.println(b);//true
        System.out.println(c1);//[c, d]
    }

    private static void demo_addAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");

        c1.add(c2);// 将c2当做一个元素追加到c1中
        System.out.println(c1);//[a, b, c, d, [a, b, c, d]]

        c1.addAll(c2);// 将c2中的每个元素逐个添加到c1中
        System.out.println(c1);//[a, b, c, d, [a, b, c, d], a, b, c, d]
    }
}
