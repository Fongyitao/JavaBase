package _14_day_正则._01_正则表达式概述;

public class _03_预定义字符 {
    /*
* A:预定义字符类
    * . 任何字符。
    * \d 数字：[0-9]
    * \D 非数字：[^0-0]
    * \s 空白字符：[\t\n\x0B\f\r]
    * \S 非空白字符：[^\s]
    * \w 单词字符：[a-zA-Z_0-9]
    * \W 非单词字符：[^\w]

     */
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();

    }

    private static void demo4() {
        String regex = "\\w";
        System.out.println("a".matches(regex));//true
        System.out.println("#".matches(regex));//false

        String regex1 = "\\W";
        System.out.println("a".matches(regex1));//false
        System.out.println("#".matches(regex1));//true
        System.out.println("我".matches(regex1));//true
    }

    private static void demo3() {
        String regex = "\\s";
        System.out.println(" ".matches(regex));//true
        System.out.println("a".matches(regex));//false

        String regex1 = "\\S";
        System.out.println(" ".matches(regex1));//false
        System.out.println("a".matches(regex1));//true
    }

    private static void demo2() {
        String regex = "\\d";
        System.out.println("9".matches(regex));//true
        System.out.println("a".matches(regex));//false

        String regex1 = "\\D";
        System.out.println("9".matches(regex1));//false
        System.out.println("a".matches(regex1));//true
    }

    private static void demo1() {
        String regex = ".";
        System.out.println("a".matches(regex));//true
        System.out.println("aa".matches(regex));//false
    }
}
