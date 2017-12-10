package _19_day_异常._10_File类的功能;

import java.io.File;

public class _06_案例 {
    /*
    * A:案例演示
    * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称

     */
    public static void main(String[] args) {
        File dir = new File("E:\\");

//        String[] arr = dir.list();//获取E盘下所有文件或者文件夹
//        for (String s:arr){
//            if(s.endsWith(".jpg")){
//                System.out.println(s);
//            }
//        }

        File[] subFiles = dir.listFiles(); // 拿到路径下所有文件和文件夹File对象
        for (File subFile : subFiles) {
            if (subFile.isFile() && subFile.getName().endsWith(".jpg")){
                System.out.println(subFile);
            }else if(subFile.isDirectory()){
                //需要用到递归继续查找
            }
        }

    }
}
