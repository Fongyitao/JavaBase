package _18_day_Map._08_HashMap嵌套HashMap;

import _18_day_Map._04_HashMap集合键是Student值是String.Student;

import java.util.HashMap;

public class HashMap嵌套HashMap {
    /*
    HashMap嵌套HashMap

    需求：
    学校有很多一年级
    第2017级一年级定义成一个双列集合，key是学生对象，value是学生归属地
    第2018级二年级定义成一个双列集合，key是学生对象，value是学生归属地

    无论2017级还是2018级都是班级对象，所以为了便于统一管理，把这些班级对象添加到学校集合中
     */
    public static void main(String[] args) {

        HashMap<Student,String> hm2017 = new HashMap<>();
        hm2017.put(new Student("张三",23),"北京");
        hm2017.put(new Student("李四",24),"北京");
        hm2017.put(new Student("王五",23),"上海");
        hm2017.put(new Student("赵六",23),"广州");

        HashMap<Student,String> hm2018 = new HashMap<>();
        hm2018.put(new Student("三藏",23),"大唐王朝");
        hm2018.put(new Student("悟空",24),"花果山");
        hm2018.put(new Student("沙僧",23),"流沙河");
        hm2018.put(new Student("悟能",23),"高老庄");

        HashMap<HashMap<Student,String>,String> hm = new HashMap<>();
        hm.put(hm2017,"第2017级一年级");
        hm.put(hm2018,"第2018级二年级");

        for (HashMap<Student,String> h :hm.keySet()){
            //String value = hm.get(h); // 根据键(hm2017 hm2018)，获取年级信息
            for(Student key:h.keySet()){
                System.out.println(hm.get(h) + "---" + key + "---" + h.get(key));
            }
        }
    }
}
