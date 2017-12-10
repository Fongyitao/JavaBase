package _16_day_泛型._12_可变参数;

public class 可变参数 {
    /*
* A:可变参数概述
    * 定义方法的时候不知道该定义多少个参数
* B:格式
    * 修饰符 返回值类型 方法名(数据类型…  变量名){}
* C:注意事项：
    * 这里的变量其实是一个数组
    * 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个

     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        print("Hello",11,22,33,44,55);

        /*
        11
        22
        33
        44
        55
        Hello
         */

    }
    public static void print(String s ,int ... arr){  //可变参数其实是一个数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(s);
    }
}
