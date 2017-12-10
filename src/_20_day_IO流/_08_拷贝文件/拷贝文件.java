package _20_day_IO流._08_拷贝文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 拷贝文件 {
    /*
    * 在控制台录入文件的路径,将文件拷贝到当前项目下
    *
    * 分析：
    * 1、创建键盘录入对象
    * 2、定义方法对键盘录入的路径进行判断，如果是文件就返回
    * 3、在主方法中接收该文件
    * 4、读和写该文件
     */
    public static void main(String[] args) throws IOException {
        File file = getFile();//获取文件
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file.getName());
        byte[] arr = new byte[1024 * 8];
        for (int len;(len = fis.read(arr)) != -1;){
            fos.write(arr,0,len);
        }
        fis.close();
        fos.close();
    }

    public static File getFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入文件名：");
        while (true){
            String line = sc.nextLine();            //接收路径
            File file = new File(line);             //封装成File对象，并对其进行判断
            if (!file.exists()){
                System.out.println("Error,文件路径不存在，请重新录入：");
            }else if(file.isDirectory()){
                System.out.println("Error,录入了文件夹，重新录入：");
            }else {
                return file;
            }
        }

    }
}
