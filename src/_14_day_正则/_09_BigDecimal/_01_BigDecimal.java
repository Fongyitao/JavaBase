package _14_day_正则._09_BigDecimal;

import java.math.BigDecimal;

public class _01_BigDecimal {
    /*
* A:BigDecimal的概述
    * 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
    * 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal

    * 不可变的、任意精度的有符号十进制数。
* B:构造方法
    * public BigDecimal(String val)
* C:成员方法
    * public BigDecimal add(BigDecimal augend)
    * public BigDecimal subtract(BigDecimal subtrahend)
    * public BigDecimal multiply(BigDecimal multiplicand)
    * public BigDecimal divide(BigDecimal divisor)
* D:案例演示
    * BigDecimal类的构造方法和成员方法使用

     */
    public static void main(String[] args) {

        System.out.println(2.0 - 1.1);//0.8999999999999999
        //二进制表示小数只能无限接近，就会出现精度损失
/*
        BigDecimal bd1 = new BigDecimal(2.0);//这种方式在开发中不推荐，因为不够精确
        BigDecimal bd2 = new BigDecimal(1.1);
        System.out.println(bd1.subtract(bd2));//0.899999999999999911182158029987476766109466552734375
*/

        BigDecimal bd1 = new BigDecimal("2.0"); //通过构造中传入字符串的方式，开发时推荐使用
        BigDecimal bd2 = new BigDecimal("1.0");
        System.out.println(bd1.subtract(bd2));//1.0

        BigDecimal bd3 = BigDecimal.valueOf(2.0);   //这种方式在开发中也是推荐的
        BigDecimal bd4 = BigDecimal.valueOf(1.0);
        System.out.println(bd3.subtract(bd4));//1.0


    }
}
