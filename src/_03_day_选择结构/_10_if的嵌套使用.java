package _03_day_选择结构;

public class _10_if的嵌套使用 {
    public static void main(String[] args) {
        // 获取三个数中的最大值
        int a = 10, b = 50, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println(a + "是最大值");
            } else {
                System.out.println(c + "是最大值");
            }
        } else {
            if (b >= c) {
                System.out.println(b + "是最大值");
            } else {
                System.out.println(c + "是最大值");
            }
        }

    }
}
