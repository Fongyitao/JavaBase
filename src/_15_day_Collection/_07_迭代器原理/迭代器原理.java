package _15_day_Collection._07_迭代器原理;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 迭代器原理 {
    /*
* A:迭代器原理
    * 迭代器原理:迭代器是对集合进行遍历,而每一个集合内部的存储结构都是不同的,
    * 所以每一个集合存和取都是不一样,那么就需要在每一个类中定义hasNext()和next()方法,
    * 这样做是可以的,但是会让整个集合体系过于臃肿,迭代器是将这样的方法向上抽取出接口,
    * 然后在每个类的内部,定义自己迭代方式,这样做的好处有二,
    * 第一、规定了整个集合体系的遍历方式都是hasNext()和next()方法,
    * 第二、代码有底层内部实现,使用者不用管怎么实现的,会用即可
* B:迭代器源码解析
    * 1,在eclipse中ctrl + shift + t找到ArrayList类
    * 2,ctrl+o查找iterator()方法
    * 3,查看返回值类型是new Itr(),说明Itr这个类实现Iterator接口
    * 4,查找Itr这个内部类,发现重写了Iterator中的所有抽象方法
     */

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("Hello");
        c.add(true);
        c.add('A');
        c.add(3.14);

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        /*
        Hello
        true
        A
        3.14
         */


    }
}
