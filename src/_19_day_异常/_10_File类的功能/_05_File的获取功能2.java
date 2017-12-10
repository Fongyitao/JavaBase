package _19_day_异常._10_File类的功能;

import java.io.File;

public class _05_File的获取功能2 {
    /*
    * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
    * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
     */
    public static void main(String[] args) {

        File file = new File("z");

        String[] arr = file.list();
        for (String s:arr){
            System.out.println(s);
        }

        File[] subFiles = file.listFiles();
        for (File file1:subFiles){
            System.out.println(file1.getAbsolutePath());
        }
    }
}
