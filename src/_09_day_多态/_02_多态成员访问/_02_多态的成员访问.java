package _09_day_多态._02_多态成员访问;

public class _02_多态的成员访问 {

    public static void main(String[] args) {

        Father f = new Son();
        System.out.println(f.num);    // 10
        f.print();    // 子类
        f.method(); // 父类静态方法

        Son s = new Son();
        System.out.println(s.num);    // 20
        s.print();    // 子类
        s.method();    // 子类静态方法

		/*
10
子类
父类静态方法
20
子类
子类静态方法
		 */
    }
}


/*
 * 成员变量：
 * 编译看左边（父类），运行看左边（父类）
 *
 * 成员方法：
 * 编译看左边（父类），运行看右边（子类），动态绑定
 *
 * 静态方法：
 * 编译看左边（父类），运行看左边（父类）
 * （静态和类相关，算不上重写，所以，访问还是看左边的）
 * 只有非静态的成员方法，编译看左边，运行看右边。
 */

class Father{
    int num = 10;
    public void print() {
        System.out.println("父类");
    }
    public static void method() {
        System.out.println("父类静态方法");
    }
}

class Son extends Father{
    int num = 20;
    public void print() {
        System.out.println("子类");
    }
    public static void method() {
        System.out.println("子类静态方法");
    }
}