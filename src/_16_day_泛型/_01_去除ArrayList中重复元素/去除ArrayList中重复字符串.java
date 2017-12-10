package _16_day_泛型._01_去除ArrayList中重复元素;

import java.util.ArrayList;
import java.util.Iterator;

public class 去除ArrayList中重复字符串 {
    /*
* A:案例演示
    * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
    * 思路：创建新集合方式

     */
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("a");
        list.add("b");

        ArrayList newList = getSingle(list);
        System.out.println(newList);//[a, b, c]

    }

    /*
    创建新集合将重复元素去掉：
    1、明确返回值类型，返回ArrayList
    2、明确参数列表ArrayList

    分析：
    1、创建新集合B
    2、根据传入的集合A，获取迭代器
    3、遍历A集合
    4、通过B集合判断地方包含A集合中的元素，不包含就添加，包含就不添加
     */
    public static ArrayList getSingle(ArrayList list){
        ArrayList newList = new ArrayList();    //创建新集合
        Iterator it = list.iterator();  //根据传入集合（老集合）获取迭代器

        while (it.hasNext()){           //遍历老集合
            Object obj = it.next();     //记录每一个元素
            if(!newList.contains(obj)){ //如果新集合中不包含该元素
                newList.add(obj);       //将该元素添加到新集合中
            }
        }
        return newList;                //返回新集合
    }
}
