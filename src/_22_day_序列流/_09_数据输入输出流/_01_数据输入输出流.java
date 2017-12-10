package _22_day_序列流._09_数据输入输出流;

import java.io.*;

public class _01_数据输入输出流 {
    /*
* 1.什么是数据输入输出流
    * DataInputStream, DataOutputStream可以按照基本数据类型大小读写数据
    * 例如按Long大小写出一个数字, 写出时该数据占8字节. 读取的时候也可以按照Long类型读取, 一次读取8个字节.
* 2.使用方式
    * DataOutputStream(OutputStream), writeInt(), writeLong()
    *
 * DataInputStream(InputStream), readInt(), readLong()
     */
    public static void main(String[] args) throws IOException {
//        demo1();

//        demo2();

//        demo3();

        demo4();


    }

    private static void demo4() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("yyy_copy.txt"));
        int x = dis.readInt();
        int y = dis.readInt();
        int z = dis.readInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        dis.close();
    }


    private static void demo3() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("yyy_copy.txt"));
        dos.write(997);
        dos.write(998);
        dos.write(999);
        dos.close();
    }

    private static void demo2() throws IOException {
        FileInputStream fis = new FileInputStream("yyy_copy.txt");
        int x = fis.read();
        int y = fis.read();
        int z = fis.read();
        int m = fis.read();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(m);
        fis.close();
        /*
        97
        98
        229
        230
         */
    }

    private static void demo1() throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy_copy.txt");
        fos.write(97);
        fos.write(98);
        fos.write(997);
        fos.write(998);
        fos.close();
        /*
        ab��
         */
    }
}
