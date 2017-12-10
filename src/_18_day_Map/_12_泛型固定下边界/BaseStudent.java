package _18_day_Map._12_泛型固定下边界;


import _18_day_Map._04_HashMap集合键是Student值是String.Student;

public class BaseStudent extends Student {
    public BaseStudent() {
    }

    public BaseStudent(String name, int age) {
        super(name, age);
    }
}
