package _18_day_Map._06_TreeMap;

import _18_day_Map._04_HashMap集合键是Student值是String.Student;

import java.util.TreeMap;

public class _01_TreeMap {
    /*
    * A:案例演示
    * TreeMap集合键是Student值是String的案例

     */
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("张三",21),"上海");
        tm.put(new Student("李四",24),"广州");
        tm.put(new Student("王五",20),"深圳");

        System.out.println(tm);
        //{Student{name=王五, age=20}=深圳, Student{name=张三, age=21}=上海, Student{name=张三, age=23}=北京, Student{name=李四, age=24}=广州}
    }
}
