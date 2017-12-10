package _12_day_String._01_Scanner;

import java.util.Scanner;

public class Scanner获取数据 {
    /**
     * *A：两个常用的方法：
     *public int nextInt()：获取一个int类型的值
     *public String nextLine() ：获取一个String类型的值
     *B：案例演示
     *a：先演示获取多个int值，多个String值得情况
     *b：再演示先获取int值，然后获取String值出现的问题
     *c：问题解决方案
     *第一种：先获取一个数值后，在创建一个新的键盘录入对象获取字符串 Scanner sc2 = new Scnner(System.in);
     *第二种：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换什么,都用nextLine()

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int i1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int i2 = sc.nextInt();
        System.out.println("i1 = " + i1 + ",i2 = " + i2);


        /*
        nextInt()是键盘录入整数的方法，当我们录入10的时候
        其实在键盘上录入的是10和\r\n，nextInt()方法只获取10就结束了
        nextLine()是键盘录入字符串的方法，可以接收任意类型，但是他凭什么能获取一行呢？
        通过\r\n，只要遇到\r\n就证明一行结束

         */
        System.out.println("请输入第一个字符串：");
        String s1 = sc.nextLine();
        System.out.print("请输入第二个字符串：");
        String s2 = sc.nextLine();
        System.out.println("s1 = " + s1 + ",s2 = " + s2);

        /**
         * 解决方案：
         * 第一种：先获取一个数值后，在创建一个新的键盘录入对象获取字符串 Scanner sc2 = new Scnner(System.in);
         *第二种：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换什么,都用nextLine()
         */

    }
}
