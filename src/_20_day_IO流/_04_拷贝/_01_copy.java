package _20_day_IO流._04_拷贝;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _01_copy {
    /*
    * FileInputStream读取
    * FileOutputStream写出
     */
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Taylor swift .jpg");// 创建输入流对象
        FileOutputStream fos = new FileOutputStream("copy.jpg");//创建输出流对象

        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }

        fis.close();
        fos.close();

    }
}
