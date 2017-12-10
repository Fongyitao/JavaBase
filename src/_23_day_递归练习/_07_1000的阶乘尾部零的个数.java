package _23_day_递归练习;

import java.math.BigInteger;

public class _07_1000的阶乘尾部零的个数 {
    /*
    * 需求:求出1000的阶乘尾部零的个数,用递归做
     */
    public static void main(String[] args) {

        BigInteger bi =  factorial(1000);
        String s = bi.toString();
        System.out.println(s);
    }

    // 求阶乘
    private static BigInteger factorial(int n) {
        BigInteger bi1 = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger bi2 = new BigInteger(String.valueOf(i));
            bi1 = bi1.multiply(bi2);
        }
        return bi1;
    }

    //递归求尾部是否是0



}
