package _11_day_hashCode._03_toString方法;
import _11_day_hashCode._02_getClass方法.Person;

public class ToString方法 {
    public static void main(String[] args) {
        Person p = new Person("李四",-20);


        System.out.println(p.toString());

        //重写toString前 ： _11_day._002_getClass方法.Person@6d6f6e28

        //重写toString后：Person{name='李四', age=0}

        //toString方法的作用：可以更方便的显示属性值

        System.out.println(p);//Person{name='李四', age=0}
        //如果直接打印对象的引用，会默认调用toString方法

    }
}
