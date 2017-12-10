package _14_day_正则._05_Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Pattern {
    /*
    * A:Pattern和Matcher的概述
* B:模式和匹配器的典型调用顺序
    * 通过JDK提供的API，查看Pattern类的说明

    * 典型的调用顺序是
    * Pattern p = Pattern.compile("a*b");
    * Matcher m = p.matcher("aaaaab");
    * boolean b = m.matches();

     */
    public static void main(String[] args) {

        Pattern p = Pattern.compile("a*b");//获取到正则表达式
        Matcher m = p.matcher("aaaaaab");//获取到匹配器
        boolean b = m.matches(); //看是否能匹配，匹配返回true

        System.out.println(b);//true

        System.out.println("aaaaaab".matches("a*b"));//true 和上面结果一样

    }
}
