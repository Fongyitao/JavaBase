package _02_day_DataType;

public class _12_Test {
    public static void main(String[] args) {
        // 看下面的程序是否哟问题
        short s = 1;
        //s = s + 1;//当short与int进行运算的时候，short会提升为int，两个int类型相加结果为int，赋值给short的时候会损失精度
        s += 1;// s = (short)(s + 1)
        System.out.println(s);// 2

    }
}
