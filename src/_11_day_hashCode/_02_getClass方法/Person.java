package _11_day_hashCode._02_getClass方法;

public class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            age = 0;
        }
        this.age = age;

    }

    public void sayHi(){
        System.out.println("Hello,My Name is:"+this.getName()+",Age:"+this.getAge());
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //重写equals方法
    public boolean equals(Object obj) {
//        return super.equals(obj);
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}
