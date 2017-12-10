package _19_day_异常._06_finally关键字的特点及作用;

public class finally关键字的特点及作用 {
    /*
    * A:finally的特点
    * 被finally控制的语句体一定会执行
    * 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
    * B:finally的作用
        * 用于释放资源，在IO流操作和数据库操作中会见到
    * C:案例演示
        * finally关键字的特点及作用

     */
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println(e);
            return;
        }finally {                                      //用于释放资源，在IO流操作和数据库操作中会见到
            System.out.println("看看我执行了吗？");
        }
    }
}
