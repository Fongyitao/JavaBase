package _17_day_HashSet_TreeSet._01_HashSet存储字符串并遍历;

import java.util.HashSet;

public class _02_HashSet存储自定义对象保证元素唯一性 {
    /*
* A:案例演示
    * 存储自定义对象，并保证元素唯一性。

            HashSet<Person> hs = new HashSet<>();
            hs.add(new Person("张三", 23));
            hs.add(new Person("张三", 23));
            hs.add(new Person("李四", 23));
            hs.add(new Person("李四", 23));
            hs.add(new Person("王五", 23));
            hs.add(new Person("赵六", 23));
* 重写hashCode()和equals()方法


* 1.HashSet原理
    * 我们使用Set集合都是需要去掉重复元素的, 如果在存储的时候逐个equals()比较, 效率较低,哈希算法提高了去重复的效率, 降低了使用equals()方法的次数
    * 当HashSet调用add()方法存储对象的时候, 先调用对象的hashCode()方法得到一个哈希值, 然后在集合中查找是否有哈希值相同的对象
        * 如果没有哈希值相同的对象就直接存入集合
        * 如果有哈希值相同的对象, 就和哈希值相同的对象逐个进行equals()比较,比较结果为false就存入, true则不存
* 2.将自定义类的对象存入HashSet去重复
    * 类中必须重写hashCode()和equals()方法
    * hashCode(): 属性相同的对象返回值必须相同, 属性不同的返回值尽量不同(提高效率)
    * equals(): 属性相同返回true, 属性不同返回false,返回false的时候存储

     */
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",18));
        hs.add(new Person("张三",18));
        hs.add(new Person("李四",20));
        hs.add(new Person("张三",18));
        hs.add(new Person("李四",20));
        hs.add(new Person("李四",19));

        System.out.println(hs);
        //[Person{name='张三', age=18}, Person{name='李四', age=19}, Person{name='李四', age=20}]
    }
}
