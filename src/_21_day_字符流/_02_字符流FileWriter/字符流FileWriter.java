package _21_day_字符流._02_字符流FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class 字符流FileWriter {
    /*
    * FileWriter类的write()方法可以自动把字符转为字节写出
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("yyy.txt");
        fw.write("人生若只如初见，何事秋风悲画扇。\r\n");
        fw.append("去年今日此门中，人面桃花相映红。\r\n");

        fw.close();
    }
}
