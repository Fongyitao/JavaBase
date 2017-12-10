package _18_day_Map._10_Collections工具类;

import java.util.ArrayList;
import java.util.Collections;

public class Collections工具类 {
    /*
    * A:Collections类概述
    * 针对集合操作 的工具类
    * B:Collections成员方法
    *
            public static <T> void sort(List<T> list)
            public static <T> int binarySearch(List<?> list,T key)
            public static <T> T max(Collection<?> coll)
            public static void reverse(List<?> list)
            public static void shuffle(List<?> list)

     */
    public static void main(String[] args) {
//        排序_sort();
//        二分查找_binarySearch();
//        获取最大值_max();
//        反转_reverse();
        随机置换_shuffle_洗牌();
    }

    private static void 随机置换_shuffle_洗牌() {
        ArrayList<String> list = new ArrayList<>();
        list.add("b");
        list.add("f");
        list.add("d");
        list.add("a");
        list.add("e");
        System.out.println(list);
        Collections.shuffle(list);// 随机置换
        System.out.println(list);
    }

    private static void 反转_reverse() {
        ArrayList<String> list = new ArrayList<>();
        list.add("b");
        list.add("f");
        list.add("d");
        list.add("a");
        list.add("e");
        System.out.println(list);//[b, f, d, a, e]
        Collections.reverse(list);
        System.out.println(list);//[e, a, d, f, b]
    }

    private static void 获取最大值_max() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("f");
        String s = Collections.max(list);
        System.out.println(s);//f
    }

    private static void 二分查找_binarySearch() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("f");

        int index = Collections.binarySearch(list,"e");
        System.out.println(index);// 3
    }

    private static void 排序_sort() {
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("d");
        System.out.println(list);//[c, b, d]

        Collections.sort(list);
        System.out.println(list);//[b, c, d]
    }
}
