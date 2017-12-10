package _22_day_序列流._06_标准输入输出流概述和输出语句;

import java.io.*;

public class _01_标准输入输出流概述和输出语句 {
    /*
* 1.什么是标准输入输出流(掌握)
    * System.in是InputStream, 标准输入流, 默认可以从键盘输入读取字节数据
    * System.out是PrintStream, 标准输出流, 默认可以向Console中输出字符和字节数据
* 2.修改标准输入输出流(了解)
    * 修改输入流: System.setIn(InputStream)
    * 修改输出流: System.setOut(PrintStream)

     */
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("yyy.txt"));                //修改标准输入流
        System.setOut(new PrintStream("yyy_setOut.txt"));         //修改标准输出流

        InputStream in = System.in;                               //获取标准输入流
        PrintStream ps = System.out;                            //获取标准输出流
        int b;
        while((b = in.read()) != -1) {                            //从yyy.txt上读取数据
            ps.write(b);                                        //将数据写到yyy_setOut.txt上
        }

        //System.out.println(); //也是一个输出流，不用关，因为没有和硬盘上的文件产生关联的管道
        in.close();
        ps.close();

    }
}
