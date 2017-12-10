package _10_day_内部类._05_匿名内部类;

public class 匿名内部类 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
/*
* A:匿名内部类
 * 就是内部类的简化写法。
* B:前提：存在一个类或者接口
 * 这里的类可以是具体类也可以是抽象类。
* C:格式：
* *
        new 类名或者接口名(){
            重写方法;
        }
*/

interface Inter{
    public void print();
}

class Outer{
    public void method() {
        new Inter() {	// 实现Inter接口

            public void print() {	// 重写抽象方法
                System.out.println("print--");
            }
        }.print();//调用方法
    }
}