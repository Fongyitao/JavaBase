package _21_day_字符流._09_使用指定的码表读写字符;

import java.io.*;

public class 使用指定的码表读写字符 {
    /*
* FileReader是使用默认码表读取文件, 如果需要使用指定码表读取, 那么可以使用InputStreamReader(字节流,编码表)
* FileWriter是使用默认码表写出文件, 如果需要使用指定码表写出, 那么可以使用OutputStreamWriter(字节流,编码表)
*
     */
    public static void main(String[] args) throws IOException {

//        demo1();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("yyy.txt"),"gbk"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("yyy_utf-8"),"utf-8"));

        for (int c;(c = br.read()) != -1;){
            bw.write(c);
        }
        br.close();
        bw.close();

    }

    private static void demo1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("yyy.txt"),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("yyy_gbk.txt"),"gbk");

        for (int c;(c = isr.read()) != -1;){
            osw.write(c);
        }
        isr.close();
        osw.close();
    }
}
