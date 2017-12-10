package _11_day_hashCode._04_equals方法;
import _11_day_hashCode._02_getClass方法.Person;

public class Equals方法 {
    /**
     *
     public boolean equals(Object obj) {
     return (this == obj);
     }
     Object中的equals方法是比较对象的地址值的，没有什么意义，
     我们需要重写他，因为在开发中我们通常比较的是对象中的属性值，
    我们认为相同属性是同一个对象，这样我们就需要重写equals方法。

     ==和equals区别：
     都可以做比较，返回值都是boolean
     区别：
     1、==是比较运算符，既可以比较基本数据类型，也可以比较引用数据类型，基本数据类型比较的是值，
     引用数据类型比较的是地址值。
     2、equals方法在没重写之前，比较的是地址值，底层依赖==，但是比较地址值是没有意义的，
     我们需要重写equals方法，比较对象中的属性值
     */
    public static void main(String[] args) {
        Person p1 = new Person("张三",23);
        Person p2 = new Person("张三",23);

        boolean b = p1.equals(p2);// 比较的是地址值
        System.out.println(b);// true

    }
}
