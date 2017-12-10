package _14_day_正则._01_正则表达式概述;

public class _02_正则_字符类 {
    /*
 * A:字符类
    * [abc] a、b 或 c（简单类）
    * [^abc] 任何字符，除了 a、b 或 c（否定）
    * [a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围）
    * [0-9] 0到9的字符都包括
    * [a-d[m-p]] a到d或m到p：[a-dm-p]
    * [a-z&&[def]] :交集
    * [a-z&&[^bc]] ：a到z，除了b和c ：[ad-z] （减去）
    * [a-z&&[^m-p]] z到z,而非m到p : [a-lq-z]
     . 代表任意字符
     */

    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
//        demo7();
//        demo8();


    }

    private static void demo8() {
        String regex = "..";
        System.out.println("a".matches(regex));//false
        System.out.println("ab".matches(regex));//true
    }

    private static void demo7() {
        String regex = "[a-z&&[^m-p]]";
        System.out.println("a".matches(regex));//true
        System.out.println("m".matches(regex));//false
        System.out.println("l".matches(regex));//true
        System.out.println("q".matches(regex));//true
        System.out.println("@".matches(regex));//false
    }

    private static void demo6() {
        String regex = "[a-z&&[^bc]]";
        System.out.println("a".matches(regex));//true
        System.out.println("b".matches(regex));//false
        System.out.println("d".matches(regex));//true
        System.out.println("1".matches(regex));//false
    }

    private static void demo5() {
        String regex = "[a-z&&[def]]";
        System.out.println("a".matches(regex));//false
        System.out.println("d".matches(regex));//true
        System.out.println("f".matches(regex));//true
        System.out.println("1".matches(regex));//false
    }

    private static void demo4() {
        String regex = "[a-d[m-p]]";
        System.out.println("a".matches(regex));//true
        System.out.println("m".matches(regex));//true
        System.out.println("e".matches(regex));//false
    }

    private static void demo3() {
        String regex = "[a-zA-Z]";
        System.out.println("a".matches(regex));//true
        System.out.println("A".matches(regex));//true
        System.out.println("z".matches(regex));//true
        System.out.println("1".matches(regex));//false
        System.out.println("$".matches(regex));//false
    }

    private static void demo2() {
        String regex = "[^abc]";
        System.out.println("a".matches(regex));//false
        System.out.println("d".matches(regex));//true
        System.out.println("1".matches(regex));//true
        System.out.println("10".matches(regex));//false ,不是单个字符
        System.out.println("%".matches(regex));//true
    }

    private static void demo1() {
        String regex = "[abc]";
        System.out.println("a".matches(regex)); //true
        System.out.println("d".matches(regex));//false
    }
}
