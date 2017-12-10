package _14_day_正则._08_BigInteger;

import java.math.BigInteger;

public class _01_BigInteger {
    /*
* A:BigInteger的概述
    * 可以让超过Integer范围内的数据进行运算
* B:构造方法
    * public BigInteger(String val)
* C:成员方法
    * public BigInteger add(BigInteger val)
    * public BigInteger subtract(BigInteger val)
    * public BigInteger multiply(BigInteger val)
    * public BigInteger divide(BigInteger val)
    * public BigInteger[] divideAndRemainder(BigInteger val)

     */
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("5");
        BigInteger bi2 = new BigInteger("3");

        System.out.println(bi1.add(bi2)); //+   :8
        System.out.println(bi1.subtract(bi2));//-   :2
        System.out.println(bi1.multiply(bi2));//*   :15
        System.out.println(bi1.divide(bi2));// 除/   :1

        BigInteger[] arr = bi1.divideAndRemainder(bi2); //除数和余数
        for (BigInteger bg : arr) {
            System.out.println(bg);//1  2
        }

    }
}
