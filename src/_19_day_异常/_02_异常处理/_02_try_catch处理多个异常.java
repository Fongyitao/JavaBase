package _19_day_异常._02_异常处理;

public class _02_try_catch处理多个异常 {
    /*
    * A:案例演示
    * try...catch的方式处理多个异常
    * JDK7以后处理多个异常的方式及注意事项
    *
    * 安卓，客户端开发，如何处理异常？ try{}catch(Exception e){}
    * ee,服务端开发，一般都是底层开发，从底层向上抛--错误日志
    *
    * try后面如果跟多个catch,那么小的异常放前面，大的异常放后面，根据多态远离了，如果大的放前面会把子类对象全部接收

     */
    public static void main(String[] args) {
//        demo1();
        int a = 10;
        int b = 0;
        int[] arr = {11,22,33,44,55};

        //JDK7如果处理多个异常：
        try {
            System.out.println(a/b);
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("出错了");
        }
    }

    private static void demo1() {
        int a = 10;
        int b = 0;
        int[] arr = {11,22,33,44,55};
        try {
            System.out.println(a/b);
            arr = null;
            System.out.println(arr[10]);
        }/*catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }*/catch (Exception e){
            System.out.println("出错了");
        }
    }

}
