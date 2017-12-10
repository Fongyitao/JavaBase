package _19_day_异常._10_File类的功能;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_File类的获取功能 {
    /*
    * A:获取功能
    * public String getAbsolutePath()：获取绝对路径
    * public String getPath():获取路径
    * public String getName():获取名称
    * public long length():获取长度。字节数
    * public long lastModified():获取最后一次的修改时间，毫秒值
    * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
    * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
* B:案例演示
    * File类的获取功能

     */
    public static void main(String[] args) {
        File file = new File("zzz");
        File file1 = new File("D:\\IdeaProjects\\01_Java基础\\zzz");

        //获取绝对路径
        System.out.println(file.getAbsolutePath());//D:\IdeaProjects\01_Java基础\zzz
        System.out.println(file1.getAbsolutePath());//D:\IdeaProjects\01_Java基础\zzz

        //获取构造方法中传入的路径
        System.out.println(file.getPath());//zzz
        System.out.println(file1.getPath());//D:\IdeaProjects\01_Java基础\zzz

        //获取文件或者文件夹的名字
        System.out.println(file.getName());//zzz
        System.out.println(file1.getName());//zzz

        //获取文件的字节个数
        System.out.println(file.length()); //0
        System.out.println(file1.length());//0

        //获取最后一次的修改时间，毫秒值
        System.out.println(file.lastModified());//1507732882448
        System.out.println(file1.lastModified());//1507732882448
        Date d = new Date(file.lastModified());
        System.out.println(d);//Wed Oct 11 22:41:22 CST 2017
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));//2017-10-11 22:41:22



    }
}
