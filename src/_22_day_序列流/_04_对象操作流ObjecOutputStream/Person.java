package _22_day_序列流._04_对象操作流ObjecOutputStream;

import java.io.Serializable;

public class Person implements Serializable {   // 只有实现了Serializable接口的类才能被序列化
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
