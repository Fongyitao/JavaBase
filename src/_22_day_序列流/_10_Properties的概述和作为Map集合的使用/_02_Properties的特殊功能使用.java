package _22_day_序列流._10_Properties的概述和作为Map集合的使用;

import java.util.Enumeration;
import java.util.Properties;

public class _02_Properties的特殊功能使用 {
    /*
* A:Properties的特殊功能
    * public Object setProperty(String key,String value)
    * public String getProperty(String key)
    * public Enumeration<String> stringPropertyNames()
* B:案例演示
    * Properties的特殊功能

     */
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("name","张三");
        prop.setProperty("tel","18687918888");
//        System.out.println(prop);//{name=张三, tel=18687918888}

        Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
        while (en.hasMoreElements()){
            String key = en.nextElement();
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
