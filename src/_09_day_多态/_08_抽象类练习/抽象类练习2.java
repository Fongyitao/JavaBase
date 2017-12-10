package _09_day_多态._08_抽象类练习;

public class 抽象类练习2 {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("德玛西亚","007",8000);
        p1.work();

        Manager m1 = new Manager("苍苍老师","927",3000,20000);
        m1.work();

    }
}
/*
*案例演示
 *假如我们在开发一个系统时需要对程序员类进行设计，程序员包含3个属性：姓名、工号、工资
 *经理除了包含程序员的属性外，另外还有一个奖金属性；
 *使用继承的思想设计出程序员类和经理类，要求类中提供必要的方法进行属性访问。

 */

abstract class Employee{
    private String name;
    private String id;
    private double salary;
    public Employee() {}
    public Employee(String name,String id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();	// 抽象方法
}

class Programmer extends Employee{
    public Programmer() {}
    public Programmer(String name,String id,double salary) {
        super(name,id,salary);
    }

    @Override
    public void work() {
        System.out.println("姓名:"+this.getName()+",id:"+this.getId()+",工资是：￥"+this.getSalary()+",我的工作是敲代码！！！");
    }
}

class Manager extends Employee{
    private double bonus;
    public Manager() {}
    public Manager(String name,String id,double salary,double bonus) {
        super(name,id,salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名:"+this.getName()+",id:"+this.getId()+",工资是：￥"+this.getSalary()+"奖金是：￥"+this.getBonus()+",我的工作是管理！！！");
    }
}
