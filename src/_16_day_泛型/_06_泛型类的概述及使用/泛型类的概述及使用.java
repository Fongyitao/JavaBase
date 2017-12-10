package _16_day_泛型._06_泛型类的概述及使用;

import _15_day_Collection._01_对象数组概述和使用.Student;

public class 泛型类的概述及使用 {
    /*
* A:泛型类概述<T>
    * 把泛型定义在类上
* B:定义格式
    * public class 类名<泛型类型1,…>
* C:注意事项
    * 泛型类型必须是引用类型
* D:案例演示
    * 泛型类的使用

     */
    public static void main(String[] args) {
        Tool<Student> t = new Tool<>();
        t.setE(new Student("张三",18));
        t.show(new Student("李四",23));//Student{name='李四', age=23}
        t.sayHi(true);//true
    }
}
