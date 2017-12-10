package _23_day_递归练习;

import java.math.BigInteger;

public class _06_1000的阶乘所有零的个数 {
    /*
    * 需求:求出1000的阶乘所有零和尾部零的个数,不用递归做
     */
    public static void main(String[] args) {

        BigInteger bi1 = factorial2(1000);
        String str = bi1.toString();//获取字符串表现形式
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' == str.charAt(i)){  // 如果字符串中出现了0字符，计数器加1
                count++;
            }
        }
        System.out.println(count);//472,一共有472个0

    }


    //for循环求阶乘
    public static BigInteger factorial2(int num){
//        int result = 1;
//        for (int i = 1; i <= num; i++){
//            result *= i;
//        }
//        return result;    // 1000的阶乘超出int取值范围，就会返回0

        BigInteger bi1 = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            BigInteger bi2 = new BigInteger(i+"");
            bi1 = bi1.multiply(bi2); //将bi1与bi2相乘的结果赋值给bi1
        }
        return bi1;
    }
}
