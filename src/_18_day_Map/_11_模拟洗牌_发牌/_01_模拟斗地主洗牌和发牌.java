package _18_day_Map._11_模拟洗牌_发牌;

import java.util.ArrayList;
import java.util.Collections;

public class _01_模拟斗地主洗牌和发牌 {
    /*
    * A:案例演示
    * _01_模拟斗地主洗牌和发牌，牌没有排序

    分析：
    1、创建一个扑克集合对象；
    2、洗牌
    3、发牌
    4、发给三个人，每个人17张，底牌最后发
    5、看牌
     */

    public static void main(String[] args) {
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"红桃","黑桃","方片","梅花"};

        ArrayList<String> poker = new ArrayList<>();
        //拼接
        for (String s1:color){
            for(String s2:num){
                poker.add(s1.concat(s2));//concat连接两个字符串
            }
        }
        poker.add("大王");
        poker.add("小王");

        //洗牌
        Collections.shuffle(poker);

        //发牌
        ArrayList<String> gaojin = new ArrayList<>();
        ArrayList<String> longwu = new ArrayList<>();
        ArrayList<String> me = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size()-3){
                dipai.add(poker.get(i)); //将三张底牌存在底牌中
            }else if(i % 3 == 0){
                gaojin.add(poker.get(i));
            }else if(i % 3 == 1){
                longwu.add(poker.get(i));
            }else {
                me.add(poker.get(i));
            }
        }

        //看牌
        System.out.println(gaojin);
        System.out.println(longwu);
        System.out.println(me);
        System.out.println(dipai);

    }
}
