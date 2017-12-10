package _22_day_序列流._04_对象操作流ObjecOutputStream;

import java.io.*;

public class _01_对象操作流ObjecOutputStream {
    /*
* 1.什么是对象操作流
    * 该流可以将一个对象写出, 或者读取一个对象到程序中. 也就是执行了序列化和反序列化的操作.
* 2.使用方式
    * 写出: new ObjectOutputStream(OutputStream), writeObject()
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);

        //序列化：将对象写到文件上
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.txt"));
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.txt"));
        Person p3 = (Person)ois.readObject();
        Person p4 = (Person)ois.readObject();

        System.out.println(p3.toString());
        System.out.println(p4.toString());

        ois.close();
    }
}
