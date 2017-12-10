package _18_day_Map._03_Map之遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _03_Map集合的遍历之键值对对象找键和值 {
    /*
* A:键值对对象找键和值思路：
    * 获取所有键值对对象的集合
    * 遍历键值对对象的集合，获取到每一个键值对对象
    * 根据键值对对象找键和值
* B:案例演示
    * Map集合的遍历之键值对对象找键和值

     */
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Jack",23);
        map.put("Ben",13);
        map.put("Alice",33);

        //  Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
        Set<Map.Entry<String ,Integer>> entrySet = map.entrySet();

        // 获取每一个对象
        Iterator<Map.Entry<String ,Integer>> it = entrySet.iterator();
        while (it.hasNext()){
            // 获取每一个Entry对象
            Map.Entry<String,Integer> en = it.next();   // 父类引用指向子类对象
            String key = en.getKey();//根据键值对对象获取键
            Integer value = en.getValue();// 获取键值对对象获取值

            System.out.println(key + "=" + value);
        }
        /*
        Alice=33
        Ben=13
        Jack=23
         */

        System.out.println("---------------");
        // foreach实现
        for (Map.Entry<String ,Integer> en :map.entrySet()){
            System.out.println(en.getKey() + "=" + en.getValue());
        }
        /*
        Alice=33
        Ben=13
        Jack=23
         */
    }
}
