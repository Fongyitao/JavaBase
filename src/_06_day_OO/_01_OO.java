package _06_day_OO;

public class _01_OO {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.gender = "男";
        s.study();
        s.sleep();
        System.out.println(s.name + "," + s.age + "," + s.gender);

    }

}
class Student{
    String name;
    int age;
    String gender;

    public void study() {
        System.out.println("学生学习");
    }
    public void sleep() {
        System.out.println("学生睡觉");
    }
}
