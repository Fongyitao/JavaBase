package _20_day_IO流._06_流的标准处理异常代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class _1_6_版本及以前 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("xxx.txt");
            fos = new FileOutputStream("yyy.txt");
            for (int b; (b = fis.read()) != -1; ) {
                fos.write(b);
            }
        }finally {
            try{
                if (fis != null){
                    fis.close();
                }
            }finally {              //try finally目的是能关一个尽量关一个
                if(fos != null){
                    fos.close();
                }
            }
        }
    }
}
