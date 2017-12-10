package _23_day_递归练习;

import java.io.File;

public class _04_按层级打印 {
    /*
    * 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印, 例如:
    aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
    aaa
        bbb.txt
        ccc.txt
        ddd.txt

        eee
            fff.txt
            ggg.txt
     */
    public static void main(String[] args) {
        File file = _01_统计该文件夹大小.getFile();
        printLev(file,0);
    }
    public static void printLev(File dir,int lev){
        // 1、把文件夹中所有文件及文件夹的名字按层级打印
        File[] subFiles = dir.listFiles();
        for (File subFile:subFiles){
            for (int i = 0;i <= lev; i++){
                System.out.print("\t");
            }
            System.out.println(subFile);
            if (subFile.isDirectory()){
                printLev(subFile,lev + 1);
            }
        }
    }
}
