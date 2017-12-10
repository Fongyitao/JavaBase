package _19_day_异常._04_Throwable的几个常见方法;

public class Throwable的几个常见方法 {
    /*
    * A:Throwable的几个常见方法
    * a:getMessage()
        * 获取异常信息，返回字符串。
    * b:toString()
        * 获取异常类名和异常信息，返回字符串。
    * c:printStackTrace()
        * 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
* B:案例演示
    * Throwable的几个常见方法的基本使用

    */
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println(e.getMessage());// 获取异常信息    / by zero
            System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
            System.out.println(e);//调用toString方法，调用异常类名和异常信息
            e.printStackTrace();//JVM默认就是用这种方式处理异常

        }
    }
}
