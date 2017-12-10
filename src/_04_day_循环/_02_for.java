package _04_day_循环;

public class _02_for {
    public static void main(String[] args) {
        // 求1-100之间偶数的和
        int suma =0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);

        int sumb = 0;
        for (int i = 0; i <= 100; i += 2) {
            sumb += i;
        }
        System.out.println(sumb);

        // 求1-100之间奇数和
        int sumc =0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0) {
                sumc += i;
            }
        }
        System.out.println(sumc);

        int sumd = 0;
        for (int i = 1; i <= 100; i += 2) {
            sumd += i;
        }
        System.out.println(sumd);
    }
}
