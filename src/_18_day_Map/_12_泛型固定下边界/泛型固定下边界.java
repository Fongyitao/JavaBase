package _18_day_Map._12_泛型固定下边界;


import _18_day_Map._004_HashMap集合键是Student值是String.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class 泛型固定下边界 {
    /*
    泛型固定下边界
    * ? super E
    *
    * 泛型固定上边界
    * ? extends E
     */
    public static void main(String[] args) {
        固定上边界();

        TreeSet<Student> ts1 = new TreeSet<>(new CompareByAge());
        ts1.add(new Student("张三",23));
        ts1.add(new Student("李四",21));
        ts1.add(new Student("王五",17));
        ts1.add(new Student("赵丽",33));

//        System.out.println(ts1);

        TreeSet<BaseStudent> ts2 = new TreeSet<>(new CompareByAge());
        ts2.add(new BaseStudent("Alice",23));
        ts2.add(new BaseStudent("Ryan",21));
        ts2.add(new BaseStudent("Rose",17));
        ts2.add(new BaseStudent("Jack",33));
        System.out.println(ts2);//用了父类的比较器

    }

    private static void 固定上边界() {
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三",23));
        list1.add(new Student("李四",24));
        list1.add(new Student("王五",23));

        ArrayList<BaseStudent> list2 = new ArrayList<>();
        list2.add(new BaseStudent("Jack",23));
        list2.add(new BaseStudent("Alice",20));
        list2.add(new BaseStudent("Ryan",18));
    }
}
class CompareByAge implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getAge() - o2.getAge();
        return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
    }
}
