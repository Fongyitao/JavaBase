package _17_day_HashSet_TreeSet._06_练习;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class _01_定义排序方法 {
    /*
* 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
*
* 分析：
* 1、定义一个List集合，并存储重复的无序的字符串
* 2、定义方法对其排序保留重复
* 3、打印List集合
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("abcd");
        list.add("bbc");
        list.add("bbc");
        list.add("dab");
        list.add("dab");
        list.add("abcd");
        list.add("aaa");

        //2、定义方法对其排序，保留重复
        sort(list);

        // 3、打印list
        System.out.println(list);

    }

    /*
    定义方法，排序并保留重复
    分析：
    1、创建TreeSet集合对象，因为String本身就具备比较功能，但是重复不会保留，所以我们用比较器
    2、将list集合中所有的元素添加到TreeSet集合中，对其排序，保留重复
    3、清空list集合
    4、将TreeSet集合中排序好的元素添加到list中
     */
    private static void sort(ArrayList<String> list) {
        //1、创建TreeSet集合对象，因为String本身就具备比较功能，但是重复不会保留，所以我们用比较器
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1:num;
            }
        });

        //2、将list集合中所有的元素添加到TreeSet集合中，对其排序，保留重复
        ts.addAll(list);

        //3、清空list集合
        list.clear();

        //4、将TreeSet集合中排序好的元素添加到list中
        list.addAll(ts);
    }
}
