package _15_day_Collection._04_集合的遍历之集合转数组遍历;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.Collection;

public class 集合的遍历之集合转数组遍历 {
    /*
* A:集合的遍历
    * 其实就是依次获取集合中的每一个元素。
* B:案例演示
    * 把集合转成数组，可以实现集合的遍历
    * toArray()
     */
    public static void main(String[] args) {

        Collection coll = new ArrayList();
        coll.add(new Student("张三", 23));        //Object obj = new Student("张三",23);
        coll.add(new Student("李四", 24));
        coll.add(new Student("王五", 25));
        coll.add(new Student("赵六", 26));

        Object[] arr = coll.toArray();                //将集合转换成数组
        for (int i = 0; i < arr.length; i++) {
            Student s = (Student) arr[i];            //强转成Student
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
