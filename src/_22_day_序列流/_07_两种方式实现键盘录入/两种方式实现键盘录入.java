package _22_day_序列流._07_两种方式实现键盘录入;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 两种方式实现键盘录入 {
    /*
* A:BufferedReader的readLine方法。
    * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
* B:Scanner

     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //InputStreamReader转换流
        String line = br.readLine();
        System.out.println(line);
        br.close();

        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        System.out.println(line1);
        sc.close();
    }
}
