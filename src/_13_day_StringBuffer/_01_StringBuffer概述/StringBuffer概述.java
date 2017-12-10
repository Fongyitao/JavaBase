package _13_day_StringBuffer._01_StringBuffer概述;
/**
 ###13.01_常见对象(StringBuffer类的概述)
 * A:StringBuffer类概述
 * 通过JDK提供的API，查看StringBuffer类的说明
 * 线程安全的可变字符序列
 * B:StringBuffer和String的区别
 * String是一个不可变的字符序列
 * StringBuffer是一个可变的字符序列

 ###13.02_常见对象(StringBuffer类的构造方法)
 * A:StringBuffer的构造方法：
 * public StringBuffer():无参构造方法
 * public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 * public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 * B:StringBuffer的方法：
 * public int capacity()：返回当前容量。    理论值(不掌握)
 * public int length():返回长度（字符数）。 实际值
 * C:案例演示
 * 构造方法和长度方法的使用
 */
public class StringBuffer概述 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());    // 容器中的字符个数,实际值 : 0
        System.out.println(sb.capacity());  // 容器的初始容量，理论值 : 16

        System.out.println("------------");
        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());       // 实际值 : 0
        System.out.println(sb2.capacity());     // 理论值 : 10

        System.out.println("------------");
        StringBuffer sb3 = new StringBuffer("Hello");
        System.out.println(sb3.length());   // 实际值：5    实际字符个数
        System.out.println(sb3.capacity()); // 理论值：21   字符串的length + 初始容量
        
    }
}
