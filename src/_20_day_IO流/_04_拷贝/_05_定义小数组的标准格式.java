package _20_day_IO流._04_拷贝;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05_定义小数组的标准格式 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Faded.mp3");
        FileOutputStream fos = new FileOutputStream("Faded_copy_2.mp3");

        int len;
        byte[] arr = new byte[1024 * 8];

        while ((len = fis.read(arr)) != -1){    // 如果忘记arr,返回的就不是读取的字节个数，而是字节的码表值
            fos.write(arr,0,len);
        }

        fis.close();
        fos.close();
    }
}
