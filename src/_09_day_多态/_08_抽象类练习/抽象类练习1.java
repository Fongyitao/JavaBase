package _09_day_多态._08_抽象类练习;

public class 抽象类练习1 {

    public static void main(String[] args) {
        Animal a1 = new Cat("加菲",5);
        System.out.println(a1.getName()+","+a1.getAge());
        a1.eat();

        Cat c1 = (Cat)a1;
        c1.catchMouch();

    }

}

/*
 * *A：案例演示
     *具体事物：猫、狗
     *共性：姓名、年龄、吃饭
     *猫的特性：抓老鼠
     *狗的特性：看家
 */

abstract class Animal{
    private String name;
    private int age;
    public Animal() {} //空参构造
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();

}

class Cat extends Animal{

    public Cat() {}
    public Cat(String name,int age) {
        super(name,age);
    }

    public void catchMouch() {
        System.out.println("抓老鼠");

    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{
    public Dog() {}
    public Dog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void lookHome() {
        System.out.println("看家");

    }

}
