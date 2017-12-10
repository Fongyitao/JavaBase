package _24_day_多线程._06_实现Runnable的原理;

public class 实现Runnable的原理 {
    /*
    * 查看源码
    * 1,看Thread类的构造函数,传递了Runnable接口的引用
    * 2,通过init()方法找到传递的target给成员变量的target赋值
    * 3,查看run方法,发现run方法中有判断,如果target不为null就会调用Runnable接口子类对象的run方法
     */
}
