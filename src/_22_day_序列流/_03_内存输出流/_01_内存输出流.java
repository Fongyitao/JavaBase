package _22_day_序列流._03_内存输出流;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _01_内存输出流 {
    /*
* 1.什么是内存输出流
    * 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
* 2.使用方式
    * 创建对象: new ByteArrayOutputStream()
    * 写出数据: write(int), write(byte[])
    * 获取数据: toByteArray()
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream fis = new FileInputStream("yyy.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();   // 在内存中创建了可以增长的内存数组
        for (int i;(i = fis.read()) != -1; ){
            baos.write(i);                  //将读取到的数据逐个写到内存中
        }

        byte[] arr = baos.toByteArray();
        System.out.println(new String(arr,"utf-8"));
        fis.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("yyy.txt");
        byte[] arr = new byte[2];
        for (int i;(i = fis.read(arr)) != -1; ){
            System.out.println(new String(arr,0,i));
        }

        fis.close();
    }
}
