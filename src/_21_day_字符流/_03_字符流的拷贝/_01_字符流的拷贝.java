package _21_day_字符流._03_字符流的拷贝;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _01_字符流的拷贝 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("yyy.txt");
        FileWriter fw = new FileWriter("yyy_copy.txt");
        for (int i;(i = fr.read()) != -1;){
            fw.write(i);
        }
        fr.close();
        fw.close();
    }
}
