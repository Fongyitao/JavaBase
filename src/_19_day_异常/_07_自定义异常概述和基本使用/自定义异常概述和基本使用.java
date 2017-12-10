package _19_day_异常._07_自定义异常概述和基本使用;

public class 自定义异常概述和基本使用 {
    /*
    * A:为什么需要自定义异常
    * 通过名字区分到底是什么异常，有针对的解决办法
    * 举例：人的年龄
    * B:自定义异常概述
        * 继承自Exception
        * 继承自RuntimeException
    * C:案例演示
        * 自定义异常的基本使用

     */
    public static void main(String[] args) /*throws Exception*/{
        Person p  = new Person();
        p.setAge(-17);
        System.out.println(p.getAge());
    }
}

class AgeOutOfBoundsException extends /*Exception*/RuntimeException{//可以继承Exception 也可以继承RuntimeException,区别在于Exception在编译时必须处理
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}