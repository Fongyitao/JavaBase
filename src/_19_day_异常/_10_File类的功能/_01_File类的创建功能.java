package _19_day_异常._10_File类的功能;

import java.io.File;
import java.io.IOException;

public class _01_File类的创建功能 {

    /*
    * A:创建功能
    * public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
    * public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
    * public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
    * B:案例演示
        * File类的创建功能

        * 注意事项：
            * 如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。

     */
    public static void main(String[] args) throws IOException {
        File file = new File("xxx.txt");
        System.out.println(file.createNewFile());

        File file1 = new File("zzz");
        System.out.println(file1.createNewFile());

        File dir = new File("zz");
        System.out.println(dir.mkdir());

        File dir1 = new File("aa\\bb");
        System.out.println(dir1.mkdirs());      //创建多级目录
    }
}

