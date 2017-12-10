package _10_day_内部类._04_局部内部类访问额局部变量;

public class 局部内部类访问额局部变量 {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();

    }

}

// 局部内部类
class Outer{
    public void method() {
        class Inner{		// 局部内部类只能在其所在的方法内访问
            final int num = 10;	// 在局部内部类访问成员变量，只能定义为final
            public void print() {
                System.out.println("Hello World");
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.print();
    }

}
