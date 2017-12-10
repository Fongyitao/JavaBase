package _19_day_异常._08_异常的注意事项;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class 异常_练习 {
    /*
    * 键盘录入一个int类型的整数,对其求二进制表现形式
     * 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
     * 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
     * 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        while (true){

            String s = sc.nextLine();
            try{
                int i = Integer.parseInt(s);
                System.out.println(i + "的二进制是：" + Integer.toBinaryString(i));
                break;  //录入正确就跳出循环
            }catch (Exception e){
                try {
                    new BigInteger(s);
                    System.out.println("录入错误，您录入的是一个过大的整数，请重新录入：");
                }catch (Exception e1){
                    try {
                        new BigDecimal(s);
                        System.out.println("录入错误，您录入的是一个浮点数，请重新录入：");
                    } catch (Exception e2) {
                        System.out.println("录入错误，您录入的是非法字符，请重新录入：");
                    }
                }
            }
        }
    }
}
