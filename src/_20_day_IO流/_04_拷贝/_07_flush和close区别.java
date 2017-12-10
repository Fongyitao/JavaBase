package _20_day_IO流._04_拷贝;

import java.io.*;

public class _07_flush和close区别 {
    /*
* flush()方法
    * 用来刷新缓冲区的,刷新后可以再次写出
* close()方法
    * 用来关闭流释放资源的的,如果是带缓冲区的流对象的close()方法,不但会关闭流,还会再关闭流之前刷新缓冲区,关闭后不能再写出
     */
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Faded.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Faded_copy_4.mp3"));

        for (int b;(b = bis.read()) != -1;){
            bos.write(b);
        }

        bis.close();
        bos.close();
    }
}
