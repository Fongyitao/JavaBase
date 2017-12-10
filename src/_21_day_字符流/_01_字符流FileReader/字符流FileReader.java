package _21_day_字符流._01_字符流FileReader;

import java.io.FileReader;
import java.io.IOException;

public class 字符流FileReader {
    /*
* 1.字符流是什么
    * 字符流是可以直接读写字符的IO流
    * 字符流读取字符, 就要先读取到字节数据, 然后转为字符. 如果要写出字符, 需要把字符转为字节再写出.
* 2.FileReader
    * FileReader类的read()方法可以按照字符大小读取

     */
    public static void main(String[] args) throws IOException{
//        demo();
        FileReader fr = new FileReader("test1.txt");
        for (int i;(i = fr.read()) != -1;){
            System.out.println((char)i);
        }
        fr.close();
    }

    private static void demo() throws IOException {
        FileReader fr = new FileReader("test1.txt");
        int x = fr.read();
        System.out.println(x);//27875
        char c = (char)x;
        System.out.println(c);//泣
        fr.close();
    }
}
