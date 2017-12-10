package _04_day_循环;

public class _04_while语句 {
    public static void main(String[] args) {
        //求1-100的偶数和
        int i = 0, sum = 0;
        while (i <= 100) {
			/*
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
			*/

            sum += i;
            i += 2;
        }
        System.out.println(sum);

    }
}
