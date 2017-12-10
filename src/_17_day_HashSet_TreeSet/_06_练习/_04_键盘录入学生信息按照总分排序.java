package _17_day_HashSet_TreeSet._06_练习;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class _04_键盘录入学生信息按照总分排序 {
    /*
    * A:案例演示
    * 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
    *
    * 分析：
    * 1、定义一个学生类
    *   成员变量：姓名、语文成绩、数学成绩、英语成绩，按照总分排序
    *   成员方法：空参，有参构造
    *   toString方法
    * 2、键盘录入对象
    * 3、创建TreeSet对象，传入比较器，按总分排序
    * 4、录入5个学生，size小于5
    * 5、将录入字符串切割，用逗号切割，返回一个字符串数组，将字符串数组中从二个元组转成int
    * 6、将转换后的结果封装成Strudent对象，将Strudent添加到TreeSet中
    * 7、遍历TreeSet
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩（格式是：姓名，语文成绩，数学成绩，英语成绩）:");
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();
                return num == 0 ? 1:num;
            }
        });

        while (ts.size() < 5){
            String line = sc.nextLine();
            String[] arr = line.split(",");
            int chinese = Integer.valueOf(arr[1]);
            int math = Integer.valueOf(arr[2]);
            int english = Integer.valueOf(arr[3]);

            ts.add(new Student(arr[0],chinese,math,english));

        }

        System.out.println("排序后的信息：");
        for (Student s : ts) {
            System.out.println(s);
        }
    }
}
