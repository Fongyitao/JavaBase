package _14_day_正则._04_正则的分组功能;

public class 练习 {

    public static void main(String[] args) {

        String s = "我我要。。!~（）。我要要，，。$￥。《》<>学学学。。‘’“”。编程..编程。。。程";
        String regex = "[\\pP‘’“”~<>$￥]";
        String s1 = s.replaceAll(regex,"");
        System.out.println(s1);//我我要我要要学学学编程编程程

        String s2 = s1.replaceAll("(.)\\1+","$1");
        System.out.println(s2);//我要我要学编程编程

        String s3 = s2.replaceAll("(..)\\1+","$1");
        System.out.println(s3);//我要学编程

    }
}
