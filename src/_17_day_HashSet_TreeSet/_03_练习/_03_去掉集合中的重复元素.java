package _17_day_HashSet_TreeSet._03_练习;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _03_去掉集合中的重复元素 {
    //将集合中的重复元素去掉
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        System.out.println(list);//[a, a, b, a, c]

        HashSet<String> hs = new HashSet<>();
//        for (String s : list) {
//            hs.add(s);
//        }
        hs.addAll(list);    //用HashSet去重
        list.clear();   //清掉list中的元素
        list.addAll(hs);    //将去重后的元素添加到list集合中
        System.out.println(list);//[a, b, c]

        //  LinkedHashSet实现和HashSet一样
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);

    }
}
