package _16_day_泛型._13_Arrays类的asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays类的asList {
    /*
* A:案例演示
    * Arrays工具类的asList()方法的使用
    * Collection中toArray(T[] a)泛型版的集合转数组
    *
1、数组转成集合，不能增加或减少，但是可以用其他集合的方法操作数组/
2、数组转成集合，数组必须是引用数据类型
3、基本数据类型的数组转成集合，会将整个数组当做一个对象转换
     */
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d"};
        List<String> list = Arrays.asList(arr);//数组转集合
        System.out.println(list);//[a, b, c, d]

        //list.add("e");//UnsupportedOperationException,数组转成集合，不能增加或减少，但是可以用其他集合的方法操作数组

        int[] arr1 = {11,22,33,44,55};
        List<int[]> list1 = Arrays.asList(arr1);//基本数据类型的数组转成集合，会将整个数组当做一个对象转换
        System.out.println(list1);//[[I@75412c2f]

        Integer[] arr2 = {66,77,88,99};
        List<Integer> list2 = Arrays.asList(arr2);//数组转成集合，数组必须是引用数据类型
        System.out.println(list2);//[66, 77, 88, 99]

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("e");
        list3.add("f");
        list3.add("g");
        list3.add("h");

        String[] arr3 = list3.toArray(new String[0]);   // 当集合转换数组时，数组的长度如果是小于等于集合的size时，
                                                        // 转换后的数组长度等于集合的size，如果数组的长度大于size
                                                        //分配的数组长度就和你指定的长度一样
        for (String s : arr3) {
            System.out.println(s);
        }
        /*
        e
        f
        g
        h
         */

    }
}
