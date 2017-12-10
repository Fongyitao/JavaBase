package _22_day_序列流._04_对象操作流ObjecOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _02_对象操作流ObjectInputStream {
    /*
    * 读取: new ObjectInputStream(InputStream), readObject()
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.txt"));
        Person p1 = (Person)ois.readObject();
        Person p2 = (Person)ois.readObject();
//        Person p3 = (Person)ois.readObject();//当文件到了末尾时，出现EOFException异常


        System.out.println(p1.toString());
        System.out.println(p2.toString());

        ois.close();

    }
}
