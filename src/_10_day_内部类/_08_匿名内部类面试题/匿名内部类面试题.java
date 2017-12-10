package _10_day_内部类._08_匿名内部类面试题;

public class 匿名内部类面试题 {

    public static void main(String[] args) {
        Outer.method().show();	// 对象.方法();说明Outer.method()返回的是一个对象

        Inter i = Outer.method(); // 上面的一句等价于下面这两句
        i.show();
    }
}

/*
* A:面试题
*
        按照要求，补齐代码
        interface Inter { void show(); }
        class Outer { //补齐代码 }
        class OuterDemo {
            public static void main(String[] args) {
                  Outer.method().show();
              }
        }
        要求在控制台输出”HelloWorld”

*/

interface Inter {
    void show();
}

class Outer {
    public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}
