package _15_day_Collection._08_List集合的特有功能;

import java.util.ArrayList;
import java.util.List;

public class _01_List集合的特有功能 {
    /*
* A:List集合的特有功能概述
    * void add(int index,E element)
    * E remove(int index)
    * E get(int index)
    * E set(int index,E element)
     */

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(2);
        list.add(1,true);   // 当存储使用不存在的索引，会出现索引越界异常，index <= size && index >= 0

        System.out.println(list);//[a, true, b, c, 2]


        Object o = list.remove(2);// 通过索引删除元素，将被删除的元素返回
        System.out.println(o); //b


        Object obj1 = list.get(0);//可以通过get方法遍历
        System.out.println(obj1);//a
        /*
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

        list.set(2,"Z");
        System.out.println(list);//[a, true, Z, 2]
    }
}
