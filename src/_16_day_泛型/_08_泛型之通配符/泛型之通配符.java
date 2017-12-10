package _16_day_泛型._08_泛型之通配符;

import java.util.ArrayList;
import java.util.List;

public class 泛型之通配符 {
    /*
* A:泛型通配符<?>
    * 任意类型，如果没有明确，那么就是Object以及任意的Java类了
* B:? extends E
    * 向下限定，E及其子类
* C:? super E
    * 向上限定，E及其父类

     */
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>(); // 当右边的泛型是不确定时，左边可以指定为?

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三",18));
        list1.add(new Person("李四",17));
        list1.add(new Person("王五",21));

        ArrayList<Doctor> list2 = new ArrayList<>();
        list2.add(new Doctor("赵六",26));
        list2.add(new Doctor("田七",27));

        list1.addAll(list2);//只有继承关系才可以添加

        System.out.println(list1);

    }
}
