package _16_day_泛型._14_ArrayList集合嵌套;

import _11_day_hashCode._02_getClass方法.Person;

import java.util.ArrayList;

public class ArrayList集合嵌套 {
    /*
     * 集合嵌套之ArrayList嵌套ArrayList
     * 案例：
     * 我们学科，学科又分若干班级
     * 整个学科一个大集合
     * 若干个班级分为每一个小集合
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list = new ArrayList<>();

        ArrayList<Person> first = new ArrayList<>();
        first.add(new Person("张三",18));
        first.add(new Person("李四",20));
        first.add(new Person("王五",21));

        ArrayList<Person> second = new ArrayList<>();
        second.add(new Person("赵六",23));
        second.add(new Person("田七",24));

        //将班级添加到学科集合中
        list.add(first);
        list.add(second);

        //遍历学科集合
        for (ArrayList<Person> a:list){
            for(Person p:a){
                System.out.println(p);
            }
        }
        /*
        Person{name='张三', age=18}
        Person{name='李四', age=20}
        Person{name='王五', age=21}
        Person{name='赵六', age=23}
        Person{name='田七', age=24}
         */


    }
}
