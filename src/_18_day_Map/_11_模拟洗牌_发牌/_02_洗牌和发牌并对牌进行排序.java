package _18_day_Map._11_模拟洗牌_发牌;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class _02_洗牌和发牌并对牌进行排序 {
    /*
    * A:案例演示
    * 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
*

     */
    public static void main(String[] args) {
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"红桃","黑桃","方片","梅花"};

        HashMap<Integer,String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        //拼接扑克牌，并将索引和扑克存到HashMap中
        for (String s1 : num){
            for (String s2 : color){
                hm.put(index,s2.concat(s1));
                list.add(index);
                index ++;
            }
        }
        //将小王添加到双列集合中
        hm.put(index,"小王");
        list.add(index);
        index++;
        hm.put(index,"大王");
        list.add(index);

        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> gaojin = new TreeSet<>();
        TreeSet<Integer> longwu = new TreeSet<>();
        TreeSet<Integer> me = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if(i >= list.size()-3){
                dipai.add(list.get(i)); //将三张底牌存储
            }else if(i % 3 == 0){
                gaojin.add(list.get(i));
            }else if(i % 3 == 1){
                longwu.add(list.get(i));
            }else {
                me.add(list.get(i));
            }
        }

        //看牌
        lookPoker(hm,gaojin,"高进");
        lookPoker(hm,longwu,"龙武");
        lookPoker(hm,me,"我");
        lookPoker(hm,dipai,"底牌");

    }

    /*
    看牌：
    1、返回值void
    2、参数HashMap,TreeSet,String name
     */
    public static void lookPoker(HashMap<Integer,String> hm,TreeSet<Integer> ts,String name){
        System.out.print(name + "的牌是：");
        for (Integer i:ts){ // i 代表双列集合中的每一个键
            System.out.print(hm.get(i) + " ");
        }
        System.out.println();
    }
}
