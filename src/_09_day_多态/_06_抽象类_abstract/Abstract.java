package _09_day_多态._06_抽象类_abstract;

public class Abstract {

    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

    }

}
/**
 *B：抽象类特点
 *a：抽象类和抽象方法必须用abstract关键字修饰
 *abstract class 类名 {}
 *public abstract void eat（）；
 *b：抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者接口
 *c：抽象类不能实例化那么，抽象类如何实例化呢？
 *按照多态的方法，由具体的子类实例化。其实这也是多态的一种，抽象类多态。
 *d：抽象类的子类
 *要么是抽象类
 *要么重写抽象类中的所有抽象方法
 *
 */
abstract class Animal{	// 抽象类
    public abstract void eat();// 抽象方法，不实现，没有方法体

}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

abstract class Dog extends Animal{

}
