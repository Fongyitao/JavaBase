package _19_day_异常._10_File类的功能;

import java.io.File;

public class _03_File类的判断功能 {
    /*
    * A:判断功能
    * public boolean isDirectory():判断是否是目录
    * public boolean isFile():判断是否是文件
    * public boolean exists():判断是否存在
    * public boolean canRead():判断是否可读
    * public boolean canWrite():判断是否可写
    * public boolean isHidden():判断是否隐藏
    * B:案例演示
        * File类的判断功能

     */
    public static void main(String[] args) {
        File dir = new File("zz");
        System.out.println(dir.isDirectory());//true

        File dir1 = new File("zzz");
        System.out.println(dir1.isFile());//true

        System.out.println(dir1.canRead());//true

        System.out.println(dir1.canWrite());//true

        System.out.println(dir1.isHidden());//false

        dir1.setReadable(false);//windows系统认为所有的文件都是可读的，在Linux下为false就不可以读了
        System.out.println(dir1.canRead());//true

        dir1.setWritable(false);//Windows系统可以设置为不可写
        System.out.println(dir1.canWrite());//false


    }
}
