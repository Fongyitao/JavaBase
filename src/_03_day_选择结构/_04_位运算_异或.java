package _03_day_选择结构;

public class _04_位运算_异或 {
    public static void main(String[] args) {
		/*
		 * 位异或运算符的特点
		 * ^的特点：一个数据对另一个数据位异或两次，该数本身不变。
		 */
        System.out.println(5 ^ 10 ^ 10);// 5
        System.out.println(5 ^ 10 ^ 5);// 10

        //例题：实现两个整数变量的交换
        int a =3,b = 5;
        System.out.println("a = "+a+",b ="+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a+",b ="+b);

    }
}
