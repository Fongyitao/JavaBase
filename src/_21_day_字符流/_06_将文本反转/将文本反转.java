package _21_day_字符流._06_将文本反转;

import java.io.*;
import java.util.ArrayList;

public class 将文本反转 {
    /*
    * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
     */
    public static void main(String[] args) throws IOException {
        // 1、踹年间输入输出流对象
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("yyy_reverse.txt"));

        // 2、创建集合对象
        ArrayList<String> list = new ArrayList<>();

        // 3、将读到的数据存到集合中
        for (String line;(line = br.readLine()) != null;){
            list.add(line);
        }

        // 4、倒着遍历集合将数据写到文件上
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
            bw.newLine();
        }

        // 5 、关流
        br.close();
        bw.close();

        // 注意：流对象尽量晚开早关

    }
}
