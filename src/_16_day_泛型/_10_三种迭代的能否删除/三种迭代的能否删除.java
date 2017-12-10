package _16_day_泛型._10_三种迭代的能否删除;

import java.util.ArrayList;
import java.util.Iterator;

public class 三种迭代的能否删除 {
    /*
* 普通for循环,可以删除,但是索引要--  让指针回退
* 迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常
* 增强for循环不能删除

     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d");

        //  1、普通for循环删除，索引要--
        for (int i = 0; i < list.size(); i++) {
            if("b".equals(list.get(i))){
                list.remove(i--);                 //通过索引删除
            }
        }
        System.out.println(list);//[a, a, c, c, d]

        //  2、通过迭代器删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if("a".equals(it.next())){
//                list.remove("a");//不能用集合的删除，迭代过程中如果集合修改，就会并发修改异常
                it.remove();
            }
        }
        System.out.println(list);//[c, c, d]

        //迭代器的另一种写法
        for (Iterator<String> it2 = list.iterator();it2.hasNext();){
            if ("c".equals(it2.next())){    // next方法可以将指针移动
                it2.remove();
            }
        }
        System.out.println(list);//[d]

        //  3、增强for循环不能删除


    }
}
