package _18_day_Map._02_Map集合的功能概述;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class _01_Map集合的功能概述 {
    /*
* A:Map集合的功能概述
    * a:添加功能
        * V put(K key,V value):添加元素。
            * 如果键是第一次存储，就直接存储元素，返回null
            * 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
    * b:删除功能
        * void clear():移除所有的键值对元素
        * V remove(Object key)：根据键删除键值对元素，并把值返回
    * c:判断功能
        * boolean containsKey(Object key)：判断集合是否包含指定的键
        * boolean containsValue(Object value):判断集合是否包含指定的值
        * boolean isEmpty()：判断集合是否为空
    * d:获取功能
        * Set<Map.Entry<K,V>> entrySet():
        * V get(Object key):根据键获取值
        * Set<K> keySet():获取集合中所有键的集合
        * Collection<V> values():获取集合中所有值的集合
    * e:长度功能
        * int size()：返回集合中的键值对的个数

     */
    public static void main(String[] args) {
//        put_demo();
//        remove_clear();

//        contains_isEmp();

        Map<String,Integer> map = new HashMap<>();
        map.put("Jack",23);
        map.put("Ben",13);
        map.put("Alice",33);
        System.out.println(map);//{Alice=33, Ben=13, Jack=23}

        Integer i1 = map.get("Jack");
        System.out.println(i1);//23

        Collection<Integer> c = map.values();
        System.out.println(c);//[33, 13, 23]

        System.out.println(map.size());//3

    }

    private static void contains_isEmp() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Jack",23);
        map.put("Ben",13);
        map.put("Alice",33);
        System.out.println(map);//{Alice=33, Ben=13, Jack=23}

        boolean b1 = map.containsKey("Ben");
        System.out.println(b1);//true

        boolean b2 = map.containsValue(33);
        System.out.println(b2);//true

        boolean b3 = map.isEmpty();
        System.out.println(b3);//false
    }

    private static void remove_clear() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Jack",23);
        map.put("Ben",13);
        map.put("Alice",33);
        System.out.println(map);//{Alice=33, Ben=13, Jack=23}

        Integer value = map.remove("Jack");//根据键删除值，并把值返回
        System.out.println(value);//23
        System.out.println(map);//{Alice=33, Ben=13}

        map.clear();
        System.out.println(map);//{}
    }

    private static void put_demo() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Jack",23);
        map.put("Ben",13);
        map.put("Alice",33);

        Integer i1 = map.put("Ryan",25);
        System.out.println(i1);//null

        Integer i2 = map.put("Face",26);
        System.out.println(i2);//null

        System.out.println(map);//{Ryan=25, Alice=33, Ben=13, Jack=23, Face=26}

        Integer i3 = map.put("Ryan",48);// 把被覆盖的值返回
        System.out.println(i3);//25
    }
}
