package _10_day_内部类._07_匿名内部类在开发中应用;

public class 匿名内部类在开发中应用 {
    public static void main(String[] args) {
        PersonDemo pd = new PersonDemo();
//		pd.method(new Student());	// Person不能实例化，就传个子类给他

        pd.method(new Person() {	// 匿名内部类当做参数传递（本质，把匿名内部类当做一个对象）
            public void show() {
                System.out.println("show");
            }
        });

    }
}
abstract class Person{
    public abstract void show();
}

class PersonDemo{
    public void method(Person p) {
        p.show();
    }
}

class Student extends Person{

    @Override
    public void show() {
        System.out.println("show");
    }

}