package _20_day_IO流._04_拷贝;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_字节数组拷贝之available方法 {
    /*
    * A:案例演示
    * int read(byte[] b):一次读取一个字节数组
    * write(byte[] b):一次写出一个字节数组
    * available()获取读的文件所有的字节个数
    * 弊端:有可能会内存溢出

     */
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Faded.mp3");// 创建输入流对象
        FileOutputStream fos = new FileOutputStream("Faded_copy_1.mp3");//创建输出流对象

        int len = fis.available();
        //System.out.println(len);

        //不推荐，有可能内存溢出
        byte[] arr = new byte[fis.available()]; //创建跟文件大小一样的字节数组
        fis.read(arr);  //将文件上的字节读取到内存中
        fos.write(arr); // 将字节数组中的字节数据写到文件上

        fis.close();
        fos.close();
    }
}
