package _15_day_Collection._10_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List特有ListIterator {
    /*
* boolean hasNext()是否有下一个
* boolean hasPrevious()是否有前一个
* Object next()返回下一个元素
* Object previous();返回上一个元素
     */

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("c");

        ListIterator lit = list.listIterator();//获取迭代器
        while (lit.hasNext()){                  //判断是否有下一个元素
            System.out.println(lit.next());     //获取元素，并将指针向后移动
        }

        System.out.println("---------------------");

        //只有指针位置在后面元素才行，就是先正向遍历，在反向遍历
        while (lit.hasPrevious()){              //判断是否有前一个元素
            System.out.println(lit.previous()); //获取元素，并将指针向前移动
        }
        /*
        a
        b
        world
        c
        ---------------------
        c
        world
        b
        a
         */
    }
}
