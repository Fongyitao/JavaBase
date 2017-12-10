package _14_day_正则._05_Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_正则获取功能 {
    /*
    * A:正则表达式的获取功能
    * Pattern和Matcher的结合使用
* B:案例演示
    * 需求：把一个字符串中的手机号码获取出来

     */
    public static void main(String[] args) {

        String s = "123456我的telephone number是多少呢？18687998788哈哈,还有一个13912345678";
        String regex = "1[3578]\\d{9}";//手机号码的正则表达式
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
/*
        boolean b = m.find(); // 返回boolean，找到匹配序列就返回true
        System.out.println(b);
        String s1 = m.group();// 注意：必须先find才能获取
        System.out.println(s1);//18687998788
*/
        // 注意：必须先find才能获取
        while (m.find()){
            System.out.println(m.group());
        }
        /*
        18687998788
        13912345678
         */

    }
}
