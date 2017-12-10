package _13_day_StringBuffer._02_StringBuffer的添加功能;

/**
 * A:StringBuffer的添加功能
 * public StringBuffer append(String str):
    * 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 * public StringBuffer insert(int offset,String str):
    * 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 *
 * StringBuffer是字符缓冲区，当new的时候是在堆内存创建了一个对象，
 * 底层是一个长度为16的字符数组，当调用添加的方法时，
 * 不会再重新创建对象，在不断的向原缓冲区添加字符

 */
public class StringBuffer的append {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.toString());

        StringBuffer sb2 = sb1.append(true);
        System.out.println(sb2.toString());

        StringBuffer sb3 = sb1.append("Hello");
        System.out.println(sb3.toString());

        StringBuffer sb4 = sb1.append(100);
        System.out.println(sb4.toString());

/*

true
trueHello
trueHello100
*/


    }
}
