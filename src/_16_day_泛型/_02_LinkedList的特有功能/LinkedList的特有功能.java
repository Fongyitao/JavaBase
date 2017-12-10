package _16_day_泛型._02_LinkedList的特有功能;

import java.util.LinkedList;

public class LinkedList的特有功能 {
    /*
* A:LinkedList类概述
* B:LinkedList类特有功能
    * public void addFirst(E e)及addLast(E e)
    * public E getFirst()及getLast()
    * public E removeFirst()及public E removeLast()
    * public E get(int index);

     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("d");
        list.addLast("e");

        System.out.println(list);//[c, b, a, d, e]
        System.out.println(list.getFirst());//c
        System.out.println(list.getLast());//e

        System.out.println(list.removeFirst());//c
        System.out.println(list);//[b, a, d, e]

        System.out.println(list.removeLast());//e
        System.out.println(list);//[b, a, d]


    }
}
