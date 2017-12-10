package _14_day_正则._03_正则的替换功能;

public class _03_正则的替换功能 {
    /*
    * A:正则表达式的替换功能
    * String类的功能：public String replaceAll(String regex,String replacement)
     */
    public static void main(String[] args) {
        String s = "1每2一3个4不5曾6起7舞8的9日0子，都是对生命的辜负。";
        String regex = "\\d"; //代表的是任意数字

        String s2 = s.replaceAll(regex,"");
        System.out.println(s2); //每一个不曾起舞的日子，都是对生命的辜负。

    }
}
