package _10_day_内部类._02_静态内部类;

public class InnerClass {

    public static void main(String[] args) {
        // 外部类名.内部类名  对象名 = 外部类名.内部类对象;
        Outer.Inner oi = new Outer.Inner();
        oi.method();

        Outer.Inner2.pirnt();
    }

}

class Outer{
    static class Inner{
        public void method() {
            System.out.println("method");
        }
    }
    static class Inner2{
        public static void pirnt() {
            System.out.println("print");
        }
    }
}
