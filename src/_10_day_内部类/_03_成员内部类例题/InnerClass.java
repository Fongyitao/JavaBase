package _10_day_内部类._03_成员内部类例题;

public class InnerClass {

    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }

}
/*
要求：使用已知的变量，在控制台输出30，20，10。

class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(?); // num
            System.out.println(??);// this.num
            System.out.println(???); // Outer.this.num
        }
    }
}

*/

//内部类之所以能获取到外部类的成员，是因为他能获取到外部类的引用	外部类.this

class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
