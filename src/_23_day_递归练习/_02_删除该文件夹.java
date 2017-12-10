package _23_day_递归练习;

import java.io.File;
import java.util.Scanner;

public class _02_删除该文件夹 {
    /*
    * 需求:2,从键盘接收一个文件夹路径,删除该文件夹
    *
    * 1、获取该文件夹下所有文件和文件夹
    * 2、遍历数组
    * 3、判断是文件直接删除
    * 4、如果是文件夹递归调用
    * 5、循环结束后，把空文件夹删除
     */
    public static void main(String[] args) {
        File file = getDir();
        deleteFile(file);

    }

    private static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的文件或文件夹路径：");
        while (true){
            File file = new File(sc.nextLine());
            if (!file.exists()){
                System.out.println("您输入的文件路径不存在，请重新输入：");
            }else {
                return file;
            }
        }
    }

    /*
    * 删除该文件
    * 1、返回值void
    * 2、参数File
    * 注意：这里删除是不走回收站的
     */
    public static void deleteFile(File file){
        if (file.isFile()){
            file.delete();
        }else if (file.isDirectory()){
            File[] subFiles = file.listFiles();
            for (File subFile : subFiles) {
                if (subFile.isFile()) {
                    subFile.delete();
                }else {
                    deleteFile(subFile);
                }
            }
            //循环结束后把空文件夹删掉
            file.delete();
        }
    }
}
