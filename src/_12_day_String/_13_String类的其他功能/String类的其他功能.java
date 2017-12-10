package _12_day_String._13_String类的其他功能;

public class String类的其他功能 {
    /**
     String 的替换功能
        String replace(char old,char new)
        String replace(String old,String new)

     String的去除字符串两空格及案例
        String trim()

     String的按字典顺序比较两个字符串及案例演示
        int compareTo(String str)
        int compareToIgnoreCase(String str) 不区分大小写比较
     */
    public static void main(String[] args) {
        Demo1();


        String s1 = "abc";
        String s2 = "bcd";

        int num = s1.compareTo(s2);     //按照码标值比较
        System.out.println(num);//-1

        String s3 = "a";
        String s4 = "aaaa";
        System.out.println(s3.compareTo(s4));//-3

        String s5 = "黑";
        String s6 = "马";
        System.out.println(s5.compareTo(s6));   //1125  查找的是Unicode码表
        System.out.println('黑'+0);
        System.out.println('马'+0);
        System.out.println(40657-39532);//1125

        int i = s5.compareToIgnoreCase(s6);
    }

    private static void Demo1() {
        String s1 = "   Hello He World   ";
        String s2 = s1.replace("He","你好");
        System.out.println(s2); //   你好llo 你好 World

        String s3 = s1.replace('l','A');
        System.out.println(s3); //   HeAAo He WorAd

        String s4 = s1.trim();
        System.out.println(s4);//Hello He World

        String s5 = s1.replace(" ","");
        System.out.println(s5);//HelloHeWorld
    }

}
