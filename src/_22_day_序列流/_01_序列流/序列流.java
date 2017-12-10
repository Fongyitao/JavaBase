package _22_day_序列流._01_序列流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class 序列流 {
    /*
* 1.什么是序列流
    * 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时, 将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.
* 2.使用方式
    * 整合两个: SequenceInputStream(InputStream, InputStream)

     */
    public static void main(String[] args) throws IOException {
//        demo1();

        FileInputStream fis1 = new FileInputStream("yyy.txt");
        FileInputStream fis2 = new FileInputStream("test1.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        FileOutputStream fos = new FileOutputStream("yyy_add_test1.txt");
        for (int a; (a = sis.read()) != -1; ) {
            fos.write(a);
        }
        sis.close();    //sis在关闭的时候，会将构造中传入的流对象也都关闭掉
        fos.close();

    }

    private static void demo1() throws IOException {
        FileInputStream fis1 = new FileInputStream("yyy.txt");
        FileOutputStream fos = new FileOutputStream("y_Add_t.txt");
        for (int a1; (a1 = fis1.read()) != -1; ) {
            fos.write(a1);
        }
        fis1.close();

        FileInputStream fis2 = new FileInputStream("test1.txt");
        for (int a2; (a2 = fis2.read()) != -1; ) {
            fos.write(a2);
        }
        fis2.close();
        fos.close();
    }

}
