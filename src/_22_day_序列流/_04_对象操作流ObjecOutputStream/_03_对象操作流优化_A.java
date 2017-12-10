package _22_day_序列流._04_对象操作流ObjecOutputStream;

import java.io.*;
import java.util.ArrayList;

public class _03_对象操作流优化_A {
    /*
    *将对象存储在集合中写出
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);
        Person p3 = new Person("王五",25);
        Person p4 = new Person("赵六",26);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person_3.txt"));
        oos.writeObject(list);
        oos.close();

        //将集合对象一次读取
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person_3.txt"));
        ArrayList<Person> list1 = (ArrayList<Person>) ois.readObject();

        for (Person p : list1) {
            System.out.println(p.toString());
        }
        ois.close();
    }
}
