package _15_day_Collection._09_并发修改异常及解决方案;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class 并发修改异常及解决方案 {
    /*
* A:案例演示
    * 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
* B:ConcurrentModificationException出现
    * 迭代器遍历，集合修改集合
* C:解决方案
    * a:迭代器迭代元素，迭代器修改元素(ListIterator的特有功能add)
    * b:集合遍历元素，集合修改元素

     */

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("c");

        /*
        Iterator it = list.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            if ("world".equals(str)){
                //list.add("javaee");         //在遍历的同时增加元素，并发修改
            }
        }

        //ConcurrentModificationException 并发修改异常
      */

        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            String str = (String)lit.next();
            if (str.equals("world")){
                lit.add("javaee");
            }

        }

        System.out.println(list);//[a, b, world, javaee, c]
    }
}
