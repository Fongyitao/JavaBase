package _11_day_hashCode._02_getClass方法;

public class getClass方法 {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        p1.sayHi();

        Class clazz = p1.getClass();    // 获取该对象的字节码文件
        String name = clazz.getName();
        System.out.println(name); // _11_day._002_getClass方法.Person
    }

}
