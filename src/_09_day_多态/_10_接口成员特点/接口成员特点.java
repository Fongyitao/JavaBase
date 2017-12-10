package _09_day_多态._10_接口成员特点;

public class 接口成员特点 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.num);	// 10   不能修改num说明接口中成员被final修饰
        System.out.println(Inter.num); // 10    说明接口成员被static修饰

    }
}
/*
 * *A：接口成员特点
     *成员变量：只能是常量，并且是静态的并公共的。
          *默认修饰符：public static final
          *建议：自己手动给出。
     *构造方法：接口没有构造方法。
     *成员方法：只能是抽象方法。
          *默认修饰符：public abstract
          *建议：自己手动给出。

*/

interface Inter{ //接口中所有成员都是public修饰
    int num = 10;

//	public void print() {	// 接口中不能定义非抽象方法
//
//	}

    public abstract void print();

}

class Demo extends Object implements Inter{ // 一个类不写继承类，默认继承Object类

    @Override
    public void print() {
        System.out.println(num);
    }
}