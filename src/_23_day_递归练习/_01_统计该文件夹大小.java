package _23_day_递归练习;

import java.io.File;
import java.util.Scanner;

public class _01_统计该文件夹大小 {
    /*
    * 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
    *
    * 分析：
    * 1、创建键盘录入对象
    * 2、定义一个无限循环
    * 3、将键盘录入的结果存储，并封装成File对象
    * 4、对File对象进行判断
    * 5、返回File
    *
    * 统计该文件夹大小：
    * 1、定义一个求和对象
    * 2、获取该文件夹下所有文件和文件夹listFiles()
    * 3、遍历数组
    * 4、判断是文件就计算大小并累加
    * 5、判断是文件夹递归调用
    *
    *   File dir = new File("D:\\test");
        System.out.println(dir.length());
        文件夹直接获取大小是0

     */
    public static void main(String[] args) {
        File file = getFile();
        System.out.println(getFileLength(file)/Math.pow(2,20)+ "MB");//2的20次幂

    }

    public static File getFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        for (;;){
            String line = sc.nextLine();
            File file = new File(line);
            if (!file.exists()){
                System.out.println("您录入的文件夹不存在，请重新输入：");
            }else{  //不管是文件，还是文件夹都需要获取其大小
                return file;
            }
        }
    }

    /*
    统计该文件大小
    1、返回值类型，long
    2、参数File
     */
    public static long getFileLength(File file){
        long len = 0;
        if (file.isFile()){
            len = file.length();    // 若输入的是文件就直接取文件length
        }else if (file.isDirectory()){
            File[] subFiles = file.listFiles();
            for (File subFile : subFiles) {
                if (subFile.isFile()){
                    len += subFile.length();
                }else {
                    len += getFileLength(subFile);
                }
            }
        }
        return len;
    }
}
