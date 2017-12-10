package _21_day_字符流._08_装饰设计模式;

public class 装饰设计模式 {
    /*
    装饰设计模式的好处是：
    耦合性不强，被装饰的类的变化和装饰类无关
     */
    public static void main(String[] args) {
        HeiMaStudent hms = new HeiMaStudent(new Student());
        hms.code();
        /*
        javase
        javaweb
        ssh
        数据库
        大数据
        ...
         */
    }
}

interface Code{
    public void code();
}

class Student implements Code {

    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("javaweb");
    }


}

class HeiMaStudent implements Code{

    // 1、获取被装饰类的引用
    private Student s;          // 获取学生引用

    // 2、在构造函数中传入被装饰类的对象
    public HeiMaStudent(Student s) {
        this.s = s;
    }

    // 3、对原有功能进行升级
    @Override
    public void code() {
        s.code();
        System.out.println("ssh");
        System.out.println("数据库");
        System.out.println("大数据");
        System.out.println("...");
    }
}