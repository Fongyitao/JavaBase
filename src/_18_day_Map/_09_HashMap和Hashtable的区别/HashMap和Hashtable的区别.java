package _18_day_Map._09_HashMap和Hashtable的区别;

import java.util.HashMap;

public class HashMap和Hashtable的区别 {
    /*
    * A:面试题
    * HashMap和Hashtable的区别
        * Hashtable是JDK1.0版本出现的,是线程安全的,效率低,HashMap是JDK1.2版本出现的,是线程不安全的,效率高
        * Hashtable不可以存储null键和null值,HashMap可以存储null键和null值
    * B:案例演示
        * HashMap和Hashtable的区别

     */
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put(null,null);
        hm.put("Hello",null);
        System.out.println(hm);
    }
}
