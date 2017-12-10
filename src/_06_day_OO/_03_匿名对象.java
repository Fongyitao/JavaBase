package _06_day_OO;

public class _03_匿名对象 {

    public static void main(String[] args) {

        new Car().run(); //匿名对象
        new Car().run();//匿名对象只适合一次调用,多次调用就会创建多个对象

        new Car().color = "红色";// 匿名对象可以调用属性,但是没有意义


    }

}
class Car{
    String color;
    int num;
    public void run() {
        System.out.println("车运行");
    }
}
