package _22_day_序列流._02_序列流整合多个;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class 序列流整合多个 {
    /*
    整合多个: SequenceInputStream(Enumeration)
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("yyy.txt");
        FileInputStream fis2 = new FileInputStream("test1.txt");
        FileInputStream fis3 = new FileInputStream("xxx.txt");

        Vector<FileInputStream> v = new Vector<>();
        v.add(fis1);
        v.add(fis2);
        v.add(fis3);

        Enumeration<FileInputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);//将枚举中的输入流整合成一个
        FileOutputStream fos = new FileOutputStream("y_t_x.txt");
        for (int i; (i = sis.read()) != -1; ) {
            fos.write(i);
        }
        sis.close();
        fos.close();
    }
}
