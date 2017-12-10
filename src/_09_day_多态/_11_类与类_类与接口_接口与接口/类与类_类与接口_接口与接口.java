package _09_day_多态._11_类与类_类与接口_接口与接口;

public class 类与类_类与接口_接口与接口 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.printA();
        d.printB();
        d.printC();

    }

}
/*
 * *A：类与类，类与接口，接口与接口的关系
     *a：类与类
          *继承关系，只能单继承，可以多层继承。
     *b：类与接口
          *实现关系，可以单实现，也可以多实现。
          *并且还可以在继承一个类的同时实现多个接口。
     *c：接口与接口
          *继承关系，可以单继承，也可以多继承

*/

interface InterA{
    public abstract void printA();
}

interface InterB{
    abstract void printB();
}

class Demo1 extends Object implements InterA,InterB{ // 继承一个类时候在实现多个接口

    @Override
    public void printA() {
        System.out.println("printA");
    }

    @Override
    public void printB() {
        System.out.println("printB");
    }
}

interface InterC extends InterA,InterB{ // 接口之间是继承关系，可以多继承
    abstract void printC();
}

class Demo2 implements InterC {
    @Override
    public void printA() {
        System.out.println("printA");
    }

    @Override
    public void printB() {
        System.out.println("printB");
    }

    @Override
    public void printC() {
        System.out.println("printC");
    }
}