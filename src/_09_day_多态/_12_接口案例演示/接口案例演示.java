package _09_day_多态._12_接口案例演示;

public class 接口案例演示 {
    public static void main(String[] args) {
        Cat  c = new Cat("加菲猫",8);
        c.eat();
        c.sleep();

        System.out.println("-------------------");
        JumpCat jc = new JumpCat("跳高猫",3);
        jc.eat();
        jc.sleep();
        jc.jump();

    }
}
/*
 * 动物类：姓名、年龄、吃饭、睡觉
 * 猫和狗
 * 动物培训接口:跳高
 */
abstract class Animal{

    private String name;
    private int age;
    public Animal() {}//空参构造
    public Animal(String name,int age) { //有参构造

        this.name = name;
        this.age = age;
    }
    public String getName() { 	// 获取姓名

        return name;
    }
    public void setName(String name) {	//设置姓名

        this.name = name;
    }
    public int getAge() {	// 获取年龄

        return age;
    }
    public void setAge(int age) {	// 设置年龄

        this.age = age;
    }

    public abstract void eat();	// 吃饭
    public abstract void sleep(); // 睡觉

}

interface Jump{	// 跳高的接口

    public void jump();
}

class Cat extends Animal{

    public Cat () {}//空参构造
    public Cat(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("侧着睡觉");
    }
}

class JumpCat extends Cat implements Jump{

    public JumpCat() {
        super();
    }

    public JumpCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("跳高猫");
    }
}