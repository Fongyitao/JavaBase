package _13_day_StringBuffer._12_基本类型包装类;

public class Integer类概述 {
    /*
* A:Integer类概述
    * 通过JDK提供的API，查看Integer类的说明

    * Integer 类在对象中包装了一个基本类型 int 的值,
    * 该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，
    * 还提供了处理 int 类型时非常有用的其他一些常量和方法
* B:构造方法
    * public Integer(int value)
    * public Integer(String s)
* C:案例演示
    * 使用构造方法创建对象

     */

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(60)); //111100  转二进制
        System.out.println(Integer.toOctalString(60));//74  转八进制
        System.out.println(Integer.toHexString(60));//3c    转十六进制

        System.out.println("----------------");
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        System.out.println("----------------");
        Integer i1 = 100;
        Integer i2 = Integer.valueOf("100");
        System.out.println(i1);//100
        System.out.println(i2);//100

        System.out.println("----------------");
        System.out.println(i1+i2);//200

    }
}
