package _19_day_异常._06_finally关键字的特点及作用;

public class finally面试题 {
    /*
    * A:面试题1
    * final,finally和finalize的区别
    *
    * final修饰的类，不能被继承
    * final修饰的方法，不能被重写
    * final修饰的变量，只能赋值一次
    *
    * finally是try语句中的一个语句体，不能单独使用，用来释放资源
    *
    * finalize是一个方法，当拉垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
    *
    * B:面试题2
        * 如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后。

     */
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.method());
    }
}
class Demo{
    public int method(){
        int x = 10;
        try{
            x = 20;
            System.out.println(1/0);
            return x;
        }catch (Exception e){
            x = 30;
            return x;
        }finally {
            x = 40;
            // 千万不要在finally里面写返回语句return，finally是为了释放资源，肯定会执行，如果写了返回语句，那么try和catch里面的结果都会改变
            System.out.println("finally是否执行了？");
        }
    }
}