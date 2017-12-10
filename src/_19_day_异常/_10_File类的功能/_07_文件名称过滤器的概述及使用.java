package _19_day_异常._10_File类的功能;

import java.io.File;
import java.io.FilenameFilter;

public class _07_文件名称过滤器的概述及使用 {
    /*
    * A:文件名称过滤器的概述
    * public String[] list(FilenameFilter filter)
    * public File[] listFiles(FileFilter filter)
    * B:文件名称过滤器的使用
        * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
    * C:源码分析
        * 带文件名称过滤器的list()方法的源码

     */
    public static void main(String[] args) {
        File dir = new File("E:\\");
        String[] arr = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
//                System.out.println(name);
                File file = new File(dir,name);
                return file.isFile() && file.getName().endsWith(".jpg");
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
