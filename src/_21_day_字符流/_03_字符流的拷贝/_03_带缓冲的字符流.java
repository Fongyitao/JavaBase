package _21_day_字符流._03_字符流的拷贝;

import java.io.*;

public class _03_带缓冲的字符流 {
    /*
* BufferedReader的read()方法读取字符时会一次读取若干字符到缓冲区, 然后逐个返回给程序, 降低读取文件的次数, 提高效率
* BufferedWriter的write()方法写出字符时会先写到缓冲区, 缓冲区写满时才会写到文件, 降低写文件的次数, 提高效率
*

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));    //创建字符输入流对象,关联aaa.txt
        BufferedWriter bw = new BufferedWriter(new FileWriter("yyy_copy-2.txt"));    //创建字符输出流对象,关联bbb.txt

        int ch;
        while((ch = br.read()) != -1) {        //read一次,会先将缓冲区读满,从缓冲去中一个一个的返给临时变量ch
            bw.write(ch);                    //write一次,是将数据装到字符数组,装满后再一起写出去
        }

        br.close();                            //关流
        bw.close();

    }
}
