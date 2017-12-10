package _06_day_OO;

public class _04_匿名对象的应用 {
    public static void main(String[] args) {
        Car_2 c1 = new Car_2();
        method(c1);

        method(new Car_2());// 匿名函数当做实参

    }
    //抽取方法,提高代码的复用性,跟主函数在一起的,我们写静态函数
    public static void method(Car_2 cc) {
        cc.color = "红色";
        cc.num = 8;
        cc.run();
    }
}
class Car_2{
    String color;	//颜色
    int num;		//轮胎数
    public void run() {
        System.out.println("车在运行" + ",轮胎数:" + num + ",颜色是:" + color);
    }
}