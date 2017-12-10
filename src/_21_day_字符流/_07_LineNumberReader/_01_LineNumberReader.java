package _21_day_字符流._07_LineNumberReader;


import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class _01_LineNumberReader {
    /*
    * LineNumberReader是BufferedReader的子类, 具有相同的功能, 并且可以统计行号
    * 调用getLineNumber()方法可以获取当前行号
    * 调用setLineNumber()方法可以设置当前行号
     */
    public static void main(String[] args) throws IOException {

        LineNumberReader lnr = new LineNumberReader(new FileReader("yyy.txt"));

        lnr.setLineNumber(100);//设置行号
        for (String line;(line = lnr.readLine()) != null;){
            System.out.println(lnr.getLineNumber() + ":" + line);
        }
        lnr.close();

    }
}
