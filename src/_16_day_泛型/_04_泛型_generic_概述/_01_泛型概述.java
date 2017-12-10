package _16_day_泛型._04_泛型_generic_概述;

import _15_day_Collection._01_对象数组概述和使用.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_泛型概述 {
    /*
* A:泛型概述
* B:泛型好处
* 提高安全性(将运行期的错误转换到编译期)
* 省去强转的麻烦
* C:泛型基本使用
* <>中放的必须是引用数据类型
* D:泛型使用注意事项
* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)

 */
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            //System.out.println(it.next().getName() + "," + it.next().getAge()); //next方法只能调用一次，如果调用多次会将指针向后移动
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        /*
        张三,23
        李四,24
        王五,25
         */
    }
}
