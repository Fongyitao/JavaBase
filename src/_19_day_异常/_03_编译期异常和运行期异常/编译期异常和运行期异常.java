package _19_day_异常._03_编译期异常和运行期异常;

import java.io.FileInputStream;

public class 编译期异常和运行期异常 {
    /*
    * A:编译期异常和运行期异常的区别
    * Java中的异常被分为两大类：编译时异常和运行时异常。
    * 所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常就是编译时异常

    * 编译时异常
        * Java程序必须显示处理，否则程序就会发生错误，无法通过编译
    * 运行时异常
        * 无需显示处理，也可以和编译时异常一样处理
* B:案例演示
    * 编译期异常和运行期异常的区别
     */
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("xxx.txt");
        }catch (Exception e){
            System.out.println("编译时异常");
        }
    }
}
