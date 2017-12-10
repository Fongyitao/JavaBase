package _19_day_异常._06_finally关键字的特点及作用;

public class finally特殊情况 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println(e);
            System.exit(0); // 退出JVM虚拟机
            return;
        }finally {                                      //用于释放资源，在IO流操作和数据库操作中会见到
            System.out.println("看看我执行了吗？");
        }
    }
}
