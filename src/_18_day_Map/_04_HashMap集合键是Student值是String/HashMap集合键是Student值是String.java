package _18_day_Map._04_HashMap集合键是Student值是String;

import java.util.HashMap;

public class HashMap集合键是Student值是String {
    /*
    * A:案例演示
    * HashMap集合键是Student值是String的案例

     */
    public static void main(String[] args) {

        HashMap<Student,String> hm = new HashMap<>();
        hm.put(new Student("Jack",15),"American");
        hm.put(new Student("Jack",15),"American");
        hm.put(new Student("李四",15),"广州");
        hm.put(new Student("Ryan",15),"拉萨");

        System.out.println(hm);
    }
}
