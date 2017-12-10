package _03_day_选择结构;

public class _02_短路与_短路或 {
    public static void main(String[] args) {
        /**
         * &&和&的区别?
         * a:最终结果一样。
         * b:&&具有短路效果。左边是false，右边不执行。
         *     &是无论左边是false还是true,右边都会执行
         */

		/*
		int a = 10, b = 20, c = 30;

		System.out.println(a < b && b < c);//	true && true = true
		System.out.println(a < b && b > c);//	true && false = false
		System.out.println(a > b && b < c);//	false && true = false
		System.out.println(a > b && b > c);//	false && false = false
		*/

        /**
         int x = 3, y = 4;
         System.out.println((++x == 3) & (++y == 4));// false
         System.out.println("x =" + x + ",y ="+ y);// x =4,y =5
         System.out.println("----------------");
         int n =3, m = 4;
         System.out.println((++n == 3) && (++m == 4));// false
         System.out.println("n =" + n + ",m ="+ m);// n =4,m =4

         //从上面的程序可以看出，&&的时候，后面一句（++m） == 4 是没有执行的，
         //因为m依然为4，没有执行++运算，故双与左边是false时，右边就不执行了

         */

    }
}
