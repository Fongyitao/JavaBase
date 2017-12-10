package _22_day_序列流._05_打印流的概述和特点;

import _22_day_序列流._04_对象操作流ObjecOutputStream.Person;

import java.io.*;

public class _01_打印流的概述和特点 {
    /*
    * 1.什么是打印流
    * 该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
    * System.out就是一个PrintStream, 其默认向控制台输出信息
    *
    *  * 2.使用方式
                * 打印: print(), println()
                * 自动刷出: PrintWriter(OutputStream out, boolean autoFlush, String encoding)
    * 打印流只操作数据目的
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"), true);
        pw.write(97);
        pw.print("大家好");
        pw.println("你好");                //自动刷出,只针对的是println方法
        pw.close();


    }

    private static void demo1() {
        PrintStream ps = System.out;    //获取标准输出流
        ps.println(97);     //97    底层通过Integer.toString()将97转成字符串并打印
        ps.write(97);   //a      查表，找到对应的a并打印

        Person p1 = new Person("张三",23);
        ps.println(p1); //调用了Person的toString()
        Person p2 = null;//是null就打印null
        ps.println(p2);

        ps.close();
    }
}
