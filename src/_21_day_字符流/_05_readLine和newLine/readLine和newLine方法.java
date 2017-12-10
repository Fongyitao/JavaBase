package _21_day_字符流._05_readLine和newLine;

import java.io.*;

public class readLine和newLine方法 {
    /*
* BufferedReader的readLine()方法可以读取一行字符(不包含换行符号)
* BufferedWriter的newLine()可以输出一个跨平台的换行符号"\r\n"
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("yyy_copy_3.txt"));
        String line;
        while((line = br.readLine()) != null) {
            bw.write(line);
            //bw.write("\r\n");                    //只支持windows系统
            bw.newLine();                        //跨平台的
        }

        br.close();
        bw.close();

    }
}
