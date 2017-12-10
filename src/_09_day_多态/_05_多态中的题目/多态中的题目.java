package _09_day_多态._05_多态中的题目;

public class 多态中的题目 {
    public static void main(String[] args) {
//		A a = new B();
//		a.show(); //爱
//		a.show2(); // 爱

        B b = new C();
        b.show(); // 你
        b.show2(); // 你

    }
}

class A{
    public void show() {
        show2();
    }
    public void show2() {
        System.out.println("我");
    }
}

class B extends A{
    public void show2() {
        System.out.println("爱");
    }
}

class C extends B{
    public void show2() {
        System.out.println("你");
    }
}