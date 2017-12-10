package _21_day_字符流._12_递归;

import java.io.File;
import java.util.Scanner;

public class 递归练习 {
    /*
    * 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
    *
    * 1、从键盘录入一个文件夹路径
    * 2、如果录入的路径不存在，给出提示；
    * 3、如果录入的是文件，也给出提示；
    * 4、如果录入的是文件夹直接返回；
    *
    * 5、获取到该文件夹下的所有的文件和文件夹，存储在一个File数组中
    * 6、遍历数组，对每一个文件或文件夹判断
    * 7、若是文件，并且后缀是.java的就打印
    * 8、若是文件夹，就递归调用
     */
    public static void main(String[] args) {

        File dir = getDir();
        printJavaFile(dir);
    }

    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true) {
            String line = sc.nextLine();
            File dir = new File(line);  //封装成File对象
            if (!dir.exists()) {
                System.out.println("您录入的文件路径不存在！");
            } else if (dir.isFile()) {
                System.out.println("您录入的是文件路径，请重新录入文件夹路径");
            } else {
                return dir;
            }
        }
    }

    /*
    获取文件夹路径下的所有java文件
    */
    public static void printJavaFile(File dir){
        // 获取到该文件夹下的所有的文件和文件夹，存储在一个File数组中
        File[] files = dir.listFiles();

        //遍历数组，对每一个文件或文件夹判断
        for (File subFile:files){
            //若是文件，并且后缀是.java的就打印
            if (subFile.isFile() && subFile.getName().endsWith(".java")){
                System.out.println(subFile);

            }else if(subFile.isDirectory()){       //8、若是文件夹，就递归调用
                printJavaFile(subFile);
            }
        }
    }

}
