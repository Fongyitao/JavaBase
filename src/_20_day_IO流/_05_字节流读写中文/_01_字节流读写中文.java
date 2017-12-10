package _20_day_IO流._05_字节流读写中文;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _01_字节流读写中文 {
    /*
* 字节流读取中文的问题
    * 字节流在读中文的时候有可能会读到半个中文,造成乱码
* 字节流写出中文的问题
    * 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组
    * 写出回车换行 write("\r\n".getBytes());
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test_read.txt");
        byte[] arr = new byte[4];
        for (int len;(len = fis.read(arr)) != -1 ;){
            System.out.println(new String(arr,0,len));
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("test_write.txt");
        fos.write("浮世无缘，情难到老。\r\n倾城泣别，两皆失声。\r\n怨天不公，恨爱无缘。".getBytes());
        fos.close();
    }
}
