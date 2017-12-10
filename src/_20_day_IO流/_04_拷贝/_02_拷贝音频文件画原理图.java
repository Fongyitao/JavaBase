package _20_day_IO流._04_拷贝;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02_拷贝音频文件画原理图 {
    /*
    * A:案例演示
    * 字节流一次读写一个字节复制音频
    * 弊端:效率太低

     */
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Faded.mp3");// 创建输入流对象
        FileOutputStream fos = new FileOutputStream("copy_Faded.mp3");//创建输出流对象

        int b;
        while ((b = fis.read()) != -1){ // 不推荐，效率太低
            fos.write(b);
        }


        fis.close();
        fos.close();
    }

}
