package _23_day_递归练习;

import java.io.*;

public class _03_拷贝 {
    /*
    * 需求:3,从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
    *
    * 1、在目标文件夹下创建原文件夹
    * 2、在获取原文件夹下所有文件和文件夹，存在File[]数组中
    * 3、遍历数组
    * 4、如果是文件就用IO流读写
    * 5、如果是文件夹就递归调用
     */
    public static void main(String[] args) throws IOException {
        File src = _01_统计该文件夹大小.getFile();
        File dest = _01_统计该文件夹大小.getFile();
        if (src.equals(dest)){  // 不能让目标文件夹和源文件夹同名
            System.out.println("Error,目标文件夹是源文件的子文件夹");
        }else {
            copy(src, dest);
        }
    }

    /*
    *  把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
    *  1、返回值void
    *  2、参数File src, File dest
     */
    public static void copy(File src, File dest) throws IOException {
        // 1、在目标文件夹中创建原文件夹
        File newDir = new File(dest, src.getName());
        newDir.mkdir();

        //2、在获取原文件夹下所有文件和文件夹，存在File[]数组中
        File[] subFiles = src.listFiles();
        for (File subFile : subFiles) {
            if (subFile.isFile()) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
                for (int b; (b = bis.read()) != -1; ) {
                    bos.write(b);
                }
                bis.close();
                bos.close();
            } else {
                copy(subFile, newDir);
            }
        }
    }

}
