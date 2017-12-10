package _12_day_String._04_String面试题;

public class String面试题 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println("----1----");

        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true
        System.out.println("----2----");

        String s5 = "a"+"b"+"c";
        String s6 = "abc";
        System.out.println(s5 == s6); // true
        System.out.println(s5.equals(s6)); // true
        System.out.println("----3----");

        String s7 = "ab";
        String s8 = "abc";
        String s9 = s7 + "c";
        System.out.println(s9 == s8); // false
        System.out.println(s9.equals(s8)); // true
        System.out.println("----4----");

    }
}
