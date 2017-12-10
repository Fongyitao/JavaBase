package _18_day_Map._03_Map之遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _01_Map集合的遍历之键找值 {
    /*
* A:键找值思路：
    * 获取所有键的集合
    * 遍历键的集合，获取到每一个键
    * 根据键找值
* B:案例演示
    * Map集合的遍历之键找值

     */
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Jack",23);
        map.put("Ben",13);
        map.put("Alice",33);
        System.out.println(map);//{Alice=33, Ben=13, Jack=23}

        Set<String> ketSet = map.keySet();
        Iterator<String> it = ketSet.iterator();
        while (it.hasNext()){
            String key = it.next(); //获取每一个键
            Integer value = map.get(key);   // 根据键获取值
            System.out.println(key + "," + value);
        }
        /*
        Alice,33
        Ben,13
        Jack,23
         */
        System.out.println("------------");
        // 2 、foreach
        for (String key : map.keySet()) {
            System.out.println(key + ","+map.get(key));
        }
        /*
        Alice,33
        Ben,13
        Jack,23
         */

    }
}
