package _13_day_StringBuffer._12_基本类型包装类;

public class 自动拆装箱 {
    /*
* A:JDK5的新特性
    * 自动装箱：把基本类型转换为包装类类型
    * 自动拆箱：把包装类类型转换为基本类型
* B:案例演示
    * JDK5的新特性自动装箱和拆箱

    * Integer ii = 100;
    * ii += 200;
* C:注意事项
    * 在使用时，Integer  x = null;代码就会出现NullPointerException。
    * 建议先判断是否为null，然后再使用。

     */
    public static void main(String[] args) {

        int x = 100;
        Integer i1 = x; //将基本数据类型包装成对象，装箱

        int y = i1.intValue(); // 将对象转换成基本数据类型，拆箱

        Integer i2 = 100; // 自动装箱，把基本数据类型转成对象

        int z = i2 + 100; //自动拆箱，把对象转成了基本数据类型，参与运算

        Integer i3 = null;
        int a = i3 + 100; //NullPointerException空指针异常，i3调用的是intValue,但是i3是null,null调用方法就会出现空指针
        System.out.println(a);
    }
}
