package _04_day_循环;

public class _03_求水仙花数 {
    public static void main(String[] args) {
		/*
		 * A:案例演示
		 * 需求：在控制台输出所有的”水仙花数”
		 * 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
		 * 举例：153就是一个水仙花数。
		 * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		 */

		/*设水仙花数为a
		 * 个位：a % 10
		 * 十位：a / 10 % 10
		 * 百位：a /10 / 10 % 10
		 */
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println("水仙花数：" + i);
            }
        }

    }
}
