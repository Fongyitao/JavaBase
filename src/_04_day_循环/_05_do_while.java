package _04_day_循环;

public class _05_do_while {
    public static void main(String[] args) {

        // do while至少要执行一次循环体
        int i = 11;
        do {
            System.out.println("i = "+ i);
            i++;
        } while (i <= 10);

        System.out.println("----------");

        int j = 11;
        while (j <= 10) {
            System.out.println("j = "+ j);
            j++;
        }
    }
}
