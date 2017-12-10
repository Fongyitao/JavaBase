package _15_day_Collection._08_List集合的特有功能;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.List;

public class _02_List集合存储学生对象并遍历 {
    /*
* 通过size()和get()方法结合使用遍历。
     */
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(new Student("张三",23));
        list1.add(new Student("李四",24));
        list1.add(new Student("王五",25));
        list1.add(new Student("赵六",26));

        for (int i = 0; i < list1.size(); i++) {

//            System.out.println(list1.get(i));

            Student s = (Student)list1.get(i);
            System.out.println(s.getName() +","+s.getAge());
        }
        /*
        张三,23
        李四,24
        王五,25
        赵六,26
         */
    }
}
