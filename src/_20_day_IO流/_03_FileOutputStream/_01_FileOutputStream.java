package _20_day_IO流._03_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class _01_FileOutputStream {
    /*
    * write()一次写出一个字节
     */
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("bbb.txt");    //如果没有bbb.txt,会创建出一个
        //fos.write(97);                        //虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的一个byte
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
