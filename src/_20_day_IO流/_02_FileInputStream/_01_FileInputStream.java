package _20_day_IO流._02_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _01_FileInputStream {
    /*
    * read()一次读取一个字节
     */
    public static void main(String[] args) throws IOException {

//        demo1();

        File file = new File("xxx.txt");
        FileInputStream fis = new FileInputStream(file);   //创建流对象
        int b;
        while ((b = fis.read()) != -1){     // 标准写法
            System.out.println(b);
        }
        fis.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");   //创建流对象
        int x = fis.read();     //从硬盘上读取一个字节
        System.out.println(x);

        int y = fis.read();
        System.out.println(y);

        fis.close();            //关流释放资源
    }
}
