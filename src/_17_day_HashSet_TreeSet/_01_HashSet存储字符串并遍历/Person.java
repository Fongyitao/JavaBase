package _17_day_HashSet_TreeSet._01_HashSet存储字符串并遍历;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() { }

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

    /*
    健壮性判断
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 调用的对象和传入的对象是同一个对象，直接返回true
        if (o == null || getClass() != o.getClass()) return false; // 传入对象为null，或者，两个对象的对象对应的字节码文件是否是同一个字节码，不是就返回false

        Person person = (Person) o; //向下转型

        if (age != person.age) return false;// 年龄不等，返回false

        //调用姓名是否不为null？若不为null，判断调用对象的姓名是否等于传入对象姓名；若为null,判断传入对象姓名是否为null
        return name != null ? name.equals(person.name) : person.name == null;
    }

    /*
    为什么是31？
    1、31是一个质数，只能被1和自己本身整除
    2、31这个数既不大也不小
    3、31这个数好算，2的5次方-1,2<<5 -1

     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    /*
        cpmpareTo方法return 0的时候，集合中只有一个元素
        compareTo方法返回正数的时候，集合会怎么存就怎么取
        compareTo方法返回负数的时候，集合会倒序存储
     */

    @Override
    //按照年龄排序
    public int compareTo(Person o) {
        int num = this.age - o.age;
        return num == 0?this.name.compareTo(o.name):num;
    }
}
