package _19_day_异常._09_File类的概述和构造方法;

import java.io.File;

public class _01_File类的概述和构造方法 {
    /*
    * A:File类的概述
    * File更应该叫做一个路径
        * 文件路径或者文件夹路径
        * 路径分为绝对路径和相对路径
        * 绝对路径是一个固定的路径,从盘符开始
        * 相对路径相对于某个位置,在eclipse下是指当前项目下,在dos下
    * 查看API指的是当前路径
    * 文件和目录路径名的抽象表示形式
    * B:构造方法
        * File(String pathname)：根据一个路径得到File对象
        * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
        * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
    * C:案例演示
        * File类的构造方法

     */
    public static void main(String[] args) {

        //File(String pathname)：根据一个路径得到File对象
        File file = new File("D:\\FT\\Documents\\Hello.txt");
        System.out.println(file.exists());//true

        //File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
        File file1 = new File("D:\\FT\\Documents","Hello.txt");
        System.out.println(file1.exists());//true

        //File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
        File file2 = new File("D:\\FT\\Documents");
        String child = "Hello.txt";
        File file3 = new File(file2,child);
        System.out.println(file3.exists());//true
        System.out.println(file2.exists());//true
    }
}
