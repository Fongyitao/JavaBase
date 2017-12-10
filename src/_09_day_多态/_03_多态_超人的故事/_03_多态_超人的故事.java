package _09_day_多态._03_多态_超人的故事;

public class _03_多态_超人的故事 {

    public static void main(String[] args) {
        Person p = new SuperMan();
        System.out.println(p.name);	// John  属性都是看左边
        p.谈生意();	// 谈几个亿的大单子

        System.out.println("--------------------");

        SuperMan sm = (SuperMan)p;
        sm.fly(); // I can fly
        System.out.println(sm.name); // SuperMan
        sm.谈生意(); // 谈几个亿的大单子
    }
}

class Person{
    String name = "John";
    public void 谈生意() {
        System.out.println("谈生意");
    }
}

class SuperMan extends Person {
    String name = "SuperMan";
    public void 谈生意() {
        System.out.println("谈几个亿的大单子");
    }
    public void fly() {
        System.out.println("I can fly");
    }
}
