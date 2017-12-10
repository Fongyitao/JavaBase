package _18_day_Map._06_TreeMap;

import _18_day_Map._004_HashMap集合键是Student值是String.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class _02_TreeMap传比较器 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getName().compareTo(o2.getName()); // 安装姓名比较
                return num == 0 ? o1.getAge()-o2.getAge():num;
            }
        });
        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("张三",21),"上海");
        tm.put(new Student("李四",24),"广州");
        tm.put(new Student("王五",20),"深圳");

        System.out.println(tm);
    }
}
