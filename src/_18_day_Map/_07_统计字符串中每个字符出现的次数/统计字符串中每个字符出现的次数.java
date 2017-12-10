package _18_day_Map._07_统计字符串中每个字符出现的次数;

import java.util.HashMap;

public class 统计字符串中每个字符出现的次数 {
    /*
    * A:案例演示
    * 需求：统计字符串中每个字符出现的次数
            String str = "aaaabbbcccccccccc";

      分析：
      1、定义一个需要被统计字符的字符串；
      2、将字符串转换为字符数组；
      3、定义双列集合，存储字符串中，字符以及字符出现的次数
      4、遍历字符数组，获取每一个字符，并将字符存储在双列集合中；
      5、存储过程中药判断，若集合不包含这个键，就将这个字符作为键，值为1存储，如果集合包含就将值加1存储
      6、打印双列集合获取字符出现次数
     */
    public static void main(String[] args) {

        String str = "aaaabbbcccccccccc";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();

        for (char c : arr){
            /*
            if (!hm.containsKey(c)){    // if else 实现
                hm.put(c,1);
            }else{
                hm.put(c,hm.get(c)+1);
            }*/

            hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);    // 用三元运算符实现

        }

        System.out.println(hm);//{a=4, b=3, c=10}
        for (Character key : hm.keySet()){
            System.out.println(key + "=" + hm.get(key));
        }
    }
}
