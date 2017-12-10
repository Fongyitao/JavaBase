package _19_day_异常._02_异常处理;

public class _01_try_catch {
    /*
    * A:异常处理的两种方式
    * a:try…catch…finally
        * try catch
        * try catch finally
        * try finally
    * b:throws
    * B:try...catch处理异常的基本格式
        * try…catch…finally
    * C:案例演示
        * try...catch的方式处理1个异常

        try：用来检测异常
        catch:用来捕获异常
        finally：释放资源

        世界上最真情的相依就是你在try我在catch，无论你发什么脾气，我都静静接收，默默处理

        当通过try catch处理了异常，程序会继续进行
     */
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(10, 0);
            System.out.println(x);
        }catch (ArithmeticException a){ // ArithmeticException a = new ArithmeticException();
            System.out.println("error:除数为0了");
            System.err.println(a);
        }

    }
}

class Demo{
    /*
    除法运算
     */
    public int div(int a,int b){
        return a/b;
    }
}