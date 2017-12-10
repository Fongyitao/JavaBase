package _19_day_异常._10_File类的功能;

import java.io.File;

public class _02_File类的重命名和删除功能 {
    /*
    * A:重命名和删除功能
    * public boolean renameTo(File dest):把文件重命名为指定的文件路径
    * public boolean delete():删除文件或者文件夹
* B:重命名注意事项
    * 如果路径名相同，就是改名。
    * 如果路径名不同，就是改名并剪切。
* C:删除注意事项：
    * Java中的删除不走回收站。
    * 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹

     */
    public static void main(String[] args) {
        File file = new File("01zz");
        File file1 = new File("D:\\zz");
        System.out.println(file.renameTo(file1));//重命名并剪切

        File file2 = new File("aa//bb");
        System.out.println(file2.delete());
    }
}
