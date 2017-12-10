package _22_day_序列流._06_标准输入输出流概述和输出语句;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class _02_修改标准输入输出流拷贝图片 {

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("taylor swift_1.jpg"));        //改变标准输入流
        System.setOut(new PrintStream("taylor swift_1_copy.jpg"));         //改变标准输出流

        InputStream is = System.in;                            //获取标准输入流
        PrintStream ps = System.out;                        //获取标准输出流

        int len;
        byte[] arr = new byte[1024 * 8];

        while((len = is.read(arr)) != -1) {
            ps.write(arr, 0, len);
        }

        is.close();
        ps.close();

    }
}
