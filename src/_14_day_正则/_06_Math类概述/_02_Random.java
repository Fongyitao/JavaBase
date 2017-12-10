package _14_day_正则._06_Math类概述;

import java.util.Random;

public class _02_Random {
    /*
* A:Random类的概述
    * 此类用于产生随机数如果用相同的种子创建两个 Random 实例，
    * 则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
* B:构造方法
    * public Random()
    * public Random(long seed)
* C:成员方法
    * public int nextInt()
    * public int nextInt(int n)(重点掌握)

     */
    public static void main(String[] args) {

        Random r = new Random();//默认用的纳秒值作为种子，就保证了每一纳秒生成的随机数不一样
        /*
        int x = r.nextInt();
        System.out.println(x);

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }
        */

        Random r2 = new Random(1000);// 指定了种子生成的随机数就不变了
        int a = r2.nextInt();
        int b = r2.nextInt();
        System.out.println(a);//-1244746321
        System.out.println(b);//1060493871

        for (int i = 0; i < 10; i++) {
            System.out.println(r2.nextInt(100)); // 在0至100之间生成随机数，包括0不包括100
        }
    }
}
