package _22_day_序列流._08_随机访问流概述和读写数据;

import java.io.*;

public class 随机访问流概述和读写数据 {
    /*
* A:随机访问流概述
    * RandomAccessFile概述
    * RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。
    * 支持对随机访问文件的读取和写入。

* B:read(),write(),seek()

     */
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf1 = new RandomAccessFile("yyy_copy.txt","rw");
//        raf1.write(97);
//        System.out.println(raf1.read());

        raf1.seek(10); // 设置指针位置
        /*
        seek好处：
        可以多线程下载：

         */
//        raf1.write(98);
        raf1.close();
    }
}
