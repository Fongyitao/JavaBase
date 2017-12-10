package _20_day_IO流._09_录入数据拷贝到文件;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 录入数据拷贝到文件 {
    /*
    * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
    *
    * 分析：
    * 1、创建键盘录入
    * 2、创建输出流
    * 3、定义无限循环
    * 4、遇到quit退出循环
    * 5、不是quit，就将内容写出
    * 6、关闭流
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("test1.txt",true);//可以追加写入

        for (;;){
            System.out.println("请输入想要写入的内容>>>");
            String line = sc.nextLine();
            if ("quit".equals(line)){
                break;
            }else {
                fos.write(line.getBytes()); // 字符串写出必须转成成字节数组
                fos.write("\r\n".getBytes());
            }
        }

        fos.close();
    }
}
