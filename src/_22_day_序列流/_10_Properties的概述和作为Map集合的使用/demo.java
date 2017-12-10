package _22_day_序列流._10_Properties的概述和作为Map集合的使用;

import java.io.*;

public class demo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\test\\诛仙.txt"),"gbk"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\test\\test_3.txt"),"gbk"));
        char[] arr = new char[10];
        for (int i;(i = br.read(arr)) != -1;){
            bw.write(arr,0,i);
            bw.write("\r\n");
        }
        br.close();
        bw.close();
    }
}
