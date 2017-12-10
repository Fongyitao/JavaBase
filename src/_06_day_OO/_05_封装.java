package _06_day_OO;

/**
 * ###06.14_面向对象(private关键字的概述和特点)(掌握)
 * A:人类赋值年龄的问题
 * B:private关键字特点
 * a:是一个权限修饰符
 * b:可以修饰成员变量和成员方法
 * c:被其修饰的成员只能在本类中被访问
 * C:案例演示
 * 封装和private的应用：
 * A:把成员变量用private修饰
 * B:提供对应的getXxx()和setXxx()方法
 * private仅仅是封装的一种体现形式,不能说封装就是私有
 */
public class _05_封装 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.setAge(-1);
        p1.sayHi();

    }
}

class Person{
    String name;

    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }else {
            this.age = 0;
        }

    }

    public void sayHi() {
        System.out.println(name+"..."+age);
    }
}
