package _20_day_IO流._06_流的标准处理异常代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1_7_版本 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("xxx.txt");
             FileOutputStream fos = new FileOutputStream("yyy.txt");
             ){
            for (int b; (b = fis.read()) != -1; ) {
                fos.write(b);
            }
        }
    }
}
