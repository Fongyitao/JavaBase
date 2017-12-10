package _12_day_String._03_String类的构造方法;

public class String类的构造方法 {
    /**
     * *A：常见构造方法
     *public String()：空构造
     *public String (byte[] bytes) ：把字节数组转成字符串
     *public String (byte[] bytes, int index ,int length) ：把字节数组的一部分转换成字符串
     *public String (char[] value) ：把字符数组转成字符串
     *public String (char[] value, int index, int count) ：把字符数组的一部分转成字符串
     *public String (String original)  ：把字符串常量值转成字符串
     */
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1); //

        byte[] arr1 = {97,98,99};
        String s2 = new String(arr1);//解码，将计算机读得懂的转换成我们读得懂的
        System.out.println(s2); // abc

        byte[] arr2 = {97,98,99,100,101,102};
        String s3 = new String(arr2,1,3);
        System.out.println(s3);     // bcd

        char[] arr3 = {'a','b','c'};
        String s4 = new String(arr3);
        System.out.println(s4); // abc

        char[] arr4 = {'a','b','c','d','e'};
        String s5 = new String(arr4,1,3);
        System.out.println(s5); // bcd

        String s6 = new String("嘿嘿嘿");
        System.out.println(s6); // 嘿嘿嘿

    }
}
