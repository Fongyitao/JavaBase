package _12_day_String._05_String的判断功能;

public class String的判断功能 {
    /**
     boolean equals(Object obj) : 比较字符串的内容是否相同，区分大小写
     boolean equalsIgnoreCase(String str) : 比较字符串的内容是否相同，忽略大小写
     boolean contains(String str) : 判断大字符串中是否包含小字符串
     boolean startsWith(String str) : 判断字符串是否以某个指定的字符串开头
     boolean endsWith(String str) : 判断字符串是否以某个指定字符串结尾
     boolean isEmpty() : 判断字符串是否为空
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "Abc";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // false
        System.out.println("----1----");

        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s2.equalsIgnoreCase(s3)); // true
        System.out.println("----2----");

        System.out.println(s1.contains("ab"));// true
        System.out.println("----3----");

        System.out.println(s1.startsWith("ab")); // true
        System.out.println("----4----");

        System.out.println(s1.endsWith("bc")); // true
        System.out.println("----5----");

        System.out.println(s1.isEmpty()); // false
        System.out.println("----6----");
    }
}
