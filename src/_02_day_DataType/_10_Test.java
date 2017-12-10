package _02_day_DataType;

public class _10_Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;
        c = --a;
        b = ++a;
        a = c--;

        int x = 4;
        int y = (x++)+(++x)+(x*10);
        //		  4     6     60
        System.out.println(y);//70

        byte b1 =10;
        b1++;// b = (byte)(b+1);
        //b1 = b1 + 1;//byte和int类型的1运算，byte会提升为int类型,最后和也是int，赋值给byte会损失精度

    }
}
