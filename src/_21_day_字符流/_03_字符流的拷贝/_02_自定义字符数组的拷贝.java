package _21_day_字符流._03_字符流的拷贝;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _02_自定义字符数组的拷贝 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("yyy.txt");            //创建字符输入流,关联yyy.txt
        FileWriter fw = new FileWriter("yyy.copy-1.txt");            //创建字符输出流,关联yyy.copy-1.txt

        int len;
        char[] arr = new char[1024*8];                        //创建字符数组
        while((len = fr.read(arr)) != -1) {                    //将数据读到字符数组中
            fw.write(arr, 0, len);                            //从字符数组将数据写到文件上
        }

        fr.close();                                            //关流释放资源
        fw.close();

    }
}
