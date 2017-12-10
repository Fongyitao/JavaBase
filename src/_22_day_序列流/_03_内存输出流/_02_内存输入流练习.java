package _22_day_序列流._03_内存输出流;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _02_内存输入流练习 {
    /*
    * 定义一个文件输入流,调用read(byte[] b)方法,将yyy.txt文件中的内容打印出来(byte数组大小限制为5)
    *
    * 分析：
    * 1、read(byte[] b)是字节输入流的方法，创建FileInputStream,关联yyy.txt
    * 2、创建内存输出流，将读到的数据写到内存输出流中
    * 3、创建byte[]数组，长度为5
    * 4、然后将内存输出流的数据全部转为字符串打印
    * 5、关闭输入流
     */
    public static void main(String[] args) throws IOException {
        //1、read(byte[] b)是字节输入流的方法，创建FileInputStream,关联yyy.txt
        FileInputStream fis = new FileInputStream("yyy.txt");

        // 2、创建内存输出流，将读到的数据写到内存输出流中
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // 3、创建byte[]数组，长度为5
        byte[] arr = new byte[5];

        for (int len;(len = fis.read(arr)) != -1; ){
            baos.write(arr,0,len);

        }

        // 4、然后将内存输出流的数据全部转为字符串打印
        System.out.println(baos);   //即使没有调用toString，底层也会帮我们调用

        //5、关闭输入流
        fis.close();
    }
}
