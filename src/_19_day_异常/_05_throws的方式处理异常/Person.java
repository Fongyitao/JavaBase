package _19_day_异常._05_throws的方式处理异常;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if (age > 0 && age <= 100){
            this.age = age;
        }else {
            throw new Exception("年龄非法");
        }
    }
}
