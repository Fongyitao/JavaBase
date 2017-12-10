package _18_day_Map._05_LinkedHashMap的概述和使用;

import java.util.LinkedHashMap;

public class LinkedHashMap的概述和使用 {
    /*
    * A:案例演示
    * LinkedHashMap的特点
        * 底层是链表实现的可以保证怎么存就怎么取

     */
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>();
        lhm.put("张三",21);
        lhm.put("李四",25);
        lhm.put("王五",23);
        lhm.put("赵六",23);

        System.out.println(lhm);
    }
}
