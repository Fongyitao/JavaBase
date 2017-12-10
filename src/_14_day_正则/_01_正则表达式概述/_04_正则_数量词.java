package _14_day_正则._01_正则表达式概述;

public class _04_正则_数量词 {
    /*
* A:Greedy 数量词
    * X? X，一次或一次也没有
    * X* X，零次或多次
    * X+ X，一次或多次
    * X{n} X，恰好 n 次
    * X{n,} X，至少 n 次
    * X{n,m} X，至少 n 次，但是不超过 m 次

     */
    public static void main(String[] args) {
//        demo1();  //X? X，一次或一次也没有
//        demo2();  //X* X，零次或多次
//        demo3();  //X+ X，一次或多次
//        demo4();  //X{n} X，恰好 n 次
//        demo5();  //X{n,} X，至少 n 次
//        demo6();  //X{n,m} X，至少 n 次，但是不超过 m 次


    }

    //X{n,m} X，至少 n 次，但是不超过 m 次
    private static void demo6() {
        String regex = "[abc]{5,7}";
        System.out.println("abcb".matches(regex));//false
        System.out.println("abcabc".matches(regex));//true
        System.out.println("aaaabbbbccccc".matches(regex));//false
    }

    //X{n,} X，至少 n 次
    private static void demo5() {
        String regex = "[abc]{5,}";
        System.out.println("abcb".matches(regex));//false
        System.out.println("abcbaaabc".matches(regex));//true
        System.out.println("aaaabbbbccccc".matches(regex));//true
    }

    //X{n} X，恰好 n 次
    private static void demo4() {
        String regex = "[abc]{5}";
        System.out.println("abcba".matches(regex));//true
        System.out.println("abcbaaabc".matches(regex));//false
        System.out.println("aaaabbbbccccc".matches(regex));//false
    }

    //X+ X，一次或多次
    private static void demo3() {
        String regex = "[abc]+";
        System.out.println("".matches(regex));//false
        System.out.println("a".matches(regex));//true
        System.out.println("aaaabbbbccccc".matches(regex));//true
    }

    //X* X，零次或多次
    private static void demo2() {
        String regex = "[abc]*";
        System.out.println("".matches(regex));//true
        System.out.println("abc".matches(regex));//true
        System.out.println("a".matches(regex));//true
    }

    //X? X，一次或一次也没有
    private static void demo1() {
        String regex = "[abc]?";
        System.out.println("a".matches(regex));//true
        System.out.println("b".matches(regex));//true
        System.out.println("d".matches(regex));//false
    }
}
