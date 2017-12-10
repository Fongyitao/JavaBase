package _20_day_IO流._07_图片加密;

import java.io.*;

public class _01_图片加密 {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Taylor swift .jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));

        for (int b;(b = bis.read()) != -1;){
            bos.write(b ^ 123);             //异或这个数就是秘钥，解密的时候再次异或
        }

        bis.close();
        bos.close();
    }
}
