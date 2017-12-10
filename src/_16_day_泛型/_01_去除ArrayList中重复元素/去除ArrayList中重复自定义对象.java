package _16_day_泛型._01_去除ArrayList中重复元素;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class 去除ArrayList中重复自定义对象 {
    /*
* A:案例演示
    * 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
* B:注意事项
    * 重写equals()方法的
    *
    contains方法判断是否包含，底层以来的是equals方法
    remove方法底层也是依赖equals方法
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("李四",24));
        list.add(new Student("赵六",26));
        list.add(new Student("王五",25));
        list.add(new Student("张三",23));

        ArrayList newList = getSingle(list);
        System.out.println(newList);
    }
    public static ArrayList getSingle(ArrayList list){
        ArrayList newList = new ArrayList();    //创建新集合
        Iterator it = list.iterator();  //根据传入集合（老集合）获取迭代器

        while (it.hasNext()){           //遍历老集合
            Object obj = it.next();     //记录每一个元素
            if(!newList.contains(obj)){ //如果新集合中不包含该元素
                newList.add(obj);       //将该元素添加到新集合中
            }
        }
        return newList;                //返回新集合
    }
}
