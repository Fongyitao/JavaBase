package _03_day_选择结构;

public class _06_三元运算符 {
    public static void main(String[] args) {
        /**
         A:三元运算符的格式
         *         (关系表达式) ? 表达式1 : 表达式2;
         * 		B:三元运算符的执行流程
         */

        int x = 3, y = 5, z;
        z = (x > y) ? x : y;// x是否大于y,如果true，z=x;如果false，z=y;
        System.out.println(z);// 5

    }
}
