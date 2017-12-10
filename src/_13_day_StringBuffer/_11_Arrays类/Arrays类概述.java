package _13_day_StringBuffer._11_Arrays类;

import java.util.Arrays;

public class Arrays类概述 {
    /*
* A:Arrays类概述
    * 针对数组进行操作的工具类。
    * 提供了排序，查找等功能。
* B:成员方法
    * public static String toString(int[] a)
    * public static void sort(int[] a)
    * public static int binarySearch(int[] a,int key)

     */
    public static void main(String[] args) {
        int[] arr = {33,22,11,44,66,55};

        String s = Arrays.toString(arr);//数组转字符串
        System.out.println(s);//[33, 22, 11, 44, 66, 55]

        Arrays.sort(arr);//排序
        System.out.println(Arrays.toString(arr));//[11, 22, 33, 44, 55, 66]

        System.out.println(Arrays.binarySearch(arr,55));//4



    }
}
