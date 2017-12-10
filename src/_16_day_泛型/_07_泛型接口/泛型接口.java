package _16_day_泛型._07_泛型接口;

public class 泛型接口 {
    /*
* A:泛型接口概述
    * 把泛型定义在接口上
* B:定义格式
    * public interface 接口名<泛型类型>
* C:案例演示
    * 泛型接口的使用

     */
    public static void main(String[] args) {

    }
}

interface Inter<T>{
    public void show(T t);
}

class Demo1 implements Inter<String>{   //推荐使用
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

class Demo2<T> implements Inter<T>{     //没有必要再实现接口的时候给自己类加泛型
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}