package _10_day_内部类._06_匿名内部类重写多个方法调用;

public class 匿名内部类重写多个方法调用 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
interface Inter{
    public void show1();
    public void show2();
}

// 匿名内部类，只针对重写一个方法的时候使用
class Outer{
    public void method() {
		/*
		new Inter() {
			public void show1() {
				System.out.println("show1");
			}
			public void show2() {
				System.out.println("show2");
			}
		}.show1();

		new Inter() {
			public void show1() {
				System.out.println("show1");
			}
			public void show2() {
				System.out.println("show2");
			}
		}.show2();
		*/

        //优化，但是有弊端，如果有自己的内部方法就调用不了了
//        因为当调用这个方法时,局部变量如果没有用final修饰,他的生命周期和方法的生命周期是一样的,当方法弹栈,这个局部变量也会消失,那么如果局部内部类对象还没有马上消失想用这个局部变量,就没有了,如果用final修饰会在类加载的时候进入常量池,即使方法弹栈,常量池的常量还在,也可以继续使用
//
//        但是jdk1.8取消了这个事情,所以我认为这是个bug

        Inter i = new Inter() {
            public void show1() {
                System.out.println("show1");
            }
            public void show2() {
                System.out.println("show2");
            }
			/*
			public void show3() {
				System.out.println("show3");
			}
			*/

        };
        i.show1();
        i.show2();
        //i.show3(); 匿名内部类不能强转
    }
}