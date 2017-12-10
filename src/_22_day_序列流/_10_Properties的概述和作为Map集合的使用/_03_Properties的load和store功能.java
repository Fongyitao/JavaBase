package _22_day_序列流._10_Properties的概述和作为Map集合的使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _03_Properties的load和store功能 {
    /**
     * A:Properties的load()和store()功能
     * B:案例演示
     * Properties的load()和store()功能
     * */
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        //将文件上的键值对读取到集合中
        prop.load(new FileInputStream("config.properties"));
        System.out.println(prop);//{qq=123456, tel=12345678901, username=William}

        prop.setProperty("tel","1333456789");//改了但是还未写入文件
        System.out.println(prop);

        prop.store(new FileOutputStream("config.properties"),"xxx");//comments,是对列表参数的描述，可以null也可以给值
    }

}
