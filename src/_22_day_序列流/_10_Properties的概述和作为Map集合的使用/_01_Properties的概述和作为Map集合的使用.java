package _22_day_序列流._10_Properties的概述和作为Map集合的使用;

import java.util.Properties;

public class _01_Properties的概述和作为Map集合的使用 {
    /*
* A:Properties的概述是Hashtable的子类
    * Properties 类表示了一个持久的属性集。
    * Properties 可保存在流中或从流中加载。
    * 属性列表中每个键及其对应值都是一个字符串。
* B:案例演示
    * Properties作为Map集合的使用

     */
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("abc",123);
        System.out.println(prop);//{abc=123}


    }
}
