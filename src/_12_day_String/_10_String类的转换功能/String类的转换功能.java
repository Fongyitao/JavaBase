package _12_day_String._10_String类的转换功能;

import _11_day_hashCode._02_getClass方法.Person;

public class String类的转换功能 {
    /**
     byte[] getBytes() : 把字符串转换为字节数组
     char[] toCharArray() : 把字符串转换为字符数组
     static String valueOf(char[] chs) : 把字符数组转成字符串
     static String valueOf(int i) : 把int类型的数据转成字符串
     *注意：String 类的valueOf方法可以把任意类型的数据转成字符串

     String toLowerCase() : 把字符串转成小写
     String toUpperCase() : 把字符串转成大写
     String concat(String str) : 把字符串拼接
     */
    public static void main(String[] args) {

        String s1 = "iou";
        byte[] arr1 = s1.getBytes();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        // 105 111 117
        System.out.println();

        String s2 = "你好你好";
        byte[] arr2 = s2.getBytes();            // 通过GBK码表将字符串转成字节数组
        for (int j = 0; j < arr2.length; j++) { // 编码：把我们看的懂转成计算机看得懂
            System.out.print(arr2[j] + " ");    // gbk码表一个中文代表两个字节
        }                                       // gbk码表特点，中文的第一个字节肯定是负数
        //-28 -67 -96 -27 -91 -67 -28 -67 -96 -27 -91 -67
        System.out.println();

        String s3 = "琲";
        byte[] arr3 = s3.getBytes();
        for (int n = 0; n < arr3.length; n++) {
            System.out.print(arr3[n] + " ");
        }
        //-25 -112 -78
        System.out.println();

        String s4 = "Hello World";
        char[] arr4 = s4.toCharArray();
        for (int m = 0; m < arr4.length; m++) {
            System.out.print(arr4[m] + " ");
        }
        // H e l l o   W o r l d
        System.out.println();

        char[] arr5 = {'a','b','c','d','e','f'};
        String s5 = String.valueOf(arr5,1,3);
        System.out.println(s5);
        // bcd

        Person p6 = new Person("张三",14);
        String s6 = String.valueOf(p6);  // 调用了Person的toString方法
        System.out.println(s6);
        // Person{name='张三', age=14}  ： 调用了Person的toString方法，这个toString方法是重写过的

        String s7 = "I";
        String s8 = "oU";
        String s9 = s7.concat(s8);
        System.out.println(s9); // IoU

        String s10 = s9.toLowerCase();
        System.out.println(s10);   //  iou



    }

}
