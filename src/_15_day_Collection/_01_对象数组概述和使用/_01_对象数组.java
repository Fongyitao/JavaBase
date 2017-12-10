package _15_day_Collection._01_对象数组概述和使用;

public class _01_对象数组 {
    /*
    * 需求：我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
     */
    public static void main(String[] args) {

        Student[] arr = new Student[5];                    //存储学生对象
        arr[0] = new Student("张三", 23);
        arr[1] = new Student("李四", 24);
        arr[2] = new Student("王五", 25);
        arr[3] = new Student("赵六", 26);
        arr[4] = new Student("马哥", 20);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
        Student{name='张三', age=23}
        Student{name='李四', age=24}
        Student{name='王五', age=25}
        Student{name='赵六', age=26}
        Student{name='马哥', age=20}
         */

    }
}
