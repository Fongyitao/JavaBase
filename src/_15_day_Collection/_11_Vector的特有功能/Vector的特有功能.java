package _15_day_Collection._11_Vector的特有功能;

import java.util.Enumeration;
import java.util.Vector;

public class Vector的特有功能 {
    /*
* A:Vector类概述
* B:Vector类特有功能
    * public void addElement(E obj)
    * public E elementAt(int index)
    * public Enumeration elements()
* C:案例演示
    * Vector的迭代

     */
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");

        Enumeration en = v.elements();
        while (en.hasMoreElements()){               //判断集合是否有元素
            System.out.println(en.nextElement());   //获取集合中元素
        }
    }
}
