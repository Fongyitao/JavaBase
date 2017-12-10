package _21_day_字符流._10_获取文本上字符出现的次数;

import java.io.*;
import java.util.TreeMap;

public class 获取文本上字符出现的次数 {
    /*
    * 获取一个文本上每个字符出现的次数,将结果写在times.txt上
    *
    * 分析：
    * 1、创建带有缓冲的输入流对象
    * 2、创建双列集合对象TreeMap
    * 3、将读到的字符存在双列集合中，存储的时候先做判断
    * 如果不包含这个键，就将键和1存储，
    * 如果包含这个键，就将该键和值加1存储
    * 4、关闭输入流
    * 5、创建输出流对象
    * 6、遍历集合将集合中的内容写到times.txt中
    * 7、关闭输出流
     */
    public static void main(String[] args) throws IOException {
        // 1、创建带有缓冲的输入流对象
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));

        //2、创建双列集合对象TreeMap
        TreeMap<Character,Integer> tm = new TreeMap<>();

        //3、将读到的字符存在双列集合中，存储的时候先做判断
        for (int ch;(ch = br.read()) != -1;){
            char c = (char)ch;
//            if (!tm.containsKey(c)){
//                tm.put(c,1);
//            }else {
//                tm.put(c,tm.get(c) + 1);
//            }

            tm.put(c, !tm.containsValue(c) ? 1 : tm.get(c) + 1);
        }

        //4、关闭输入流
        br.close();

        //5、创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));

        //6、遍历集合将集合中的内容写到times.txt中
        for (Character key : tm.keySet()) {
            switch (key) {
                case '\t':
                    bw.write("\\t" + "=" + tm.get(key));
                    break;
                case '\n':
                    bw.write("\\n" + "=" + tm.get(key));
                    break;
                case '\r':
                    bw.write("\\r" + "=" + tm.get(key));
                    break;
                default:
                    bw.write(key + "=" + tm.get(key));
                    break;
            }
            bw.newLine();
        }

        //7、关闭输出流
        bw.close();

    }
}
