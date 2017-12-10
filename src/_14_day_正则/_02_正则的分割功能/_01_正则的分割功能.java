package _14_day_正则._02_正则的分割功能;

public class _01_正则的分割功能 {
    public static void main(String[] args) {
//        demo1();  //按空格切割
//        demo2(); //按.切割



    }

    //通过正则表达式按.切割字符串
    private static void demo2() {
        String s = "曹操.刘备.孙权.诸葛亮";
        String[] arr = s.split("\\.");// 按.切割，但是regex不能直接用. 因为.是代表任意字符，需要转义
        for (String a:arr){
            System.out.println(a);
        }
    }

    //按空格切割
    private static void demo1() {
        String s = "曹操 刘备 孙权 诸葛亮";
        String[] arr = s.split(" "); //regex是空格，按空格切割

        for (String a:arr) {
            System.out.println(a);
        }
        /*
        曹操
        刘备
        孙权
        诸葛亮
         */
    }
}
