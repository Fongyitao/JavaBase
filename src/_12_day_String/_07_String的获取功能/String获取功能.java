package _12_day_String._07_String的获取功能;

public class String获取功能 {
    /**
     int length() : 获取字符串的长度
     char charAt(int index) : 获取指定索引位置的字符
     int indexOf(int ch) : 返回指定字符在此字符串中第一次出现处的索引
     int indexOf(String str) ； 返回指定字符串在此字符串中第一次出现处的索引
     int indexOf(int ch,int fromIndex) : 返回指定字符在此字符串中从指定位置后第一次出现的索引
     int indexOf(String str,int fromIndex) : 返回指定字符串在此字符串中从指定位置后第一次出现处的索引
     lastIndexOf
     String substring(int start) : 从指定位置开始截取字符串，默认到尾
     String substring(int start,int end) : 从指定位置开始到指定位置结束截取字符串
     */
    public static void main(String[] args) {
        String s1 = "Hello World";

        System.out.println(s1.length()); // 11
        System.out.println("----1----");

        char c = s1.charAt(1);
        System.out.println(c); // e
        System.out.println("----2----");

        System.out.println(s1.indexOf('d')); // 10
        System.out.println("----3----");

        System.out.println(s1.indexOf('l',0)); // 索引2
        System.out.println("----4----");

        System.out.println(s1.indexOf("lo",1)); // 索引3  从指定位置开始找
        System.out.println("----5----");

        System.out.println(s1.lastIndexOf("Wo")); // 索引6
        System.out.println("----6----");

        String s2 = s1.substring(1,3);// "Hello World" 包含头不包含尾
        System.out.println(s2); // el

    }
}
