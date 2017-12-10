package _17_day_HashSet_TreeSet._04_TreeSet概述;

public class Human implements Comparable<Human>{
    private String name;
    private int age;

    public Human() {}

    public Human(String name, int age) {
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
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    //按照姓名排序
//    public int compareTo(Human o) {
//        int num = this.name.compareTo(o.name);//按照姓名排序
//        return num == 0 ? this.age - o.age : num;   //姓名是主要条件
//    }

    //按姓名长度排序
    public int compareTo(Human o) {
        int length = this.name.length() - o.name.length();  // 比较长度为主要
        int num = length == 0 ? this.name.compareTo(o.name):length; // 比较内容为次要
        return num == 0 ? this.age - o.age : num;   // 比较年龄为次要
    }
}
