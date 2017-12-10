package _02_day_DataType;

public class _005_DataTypeConversion {
    public static void main(String[] args) {
        float f = 3.14f;
        long x = 123;

        //f = x;			//隐式转换
        //System.out.println(f); //结果：123.0

        //x = (long)f;
        //System.out.println(x);//结果：3


        /**
         * float占4个字节
         * IEE754（规定）
         * 总共是32个二进制位
         * 首位是符号位
         * 8位代表指数位
         * 00000000-11111111
         * 0-255
         * 0代表0
         * 255代表无穷大（正无穷或负无穷）
         * 剩下1 —— 254
         * 每个指数减去127
         * 就是-126 —— 127
         * 最大就是127次幂
         * 结论就是float取值范围要比long要大
         * 23位代表小数位
         *
         */

    }
}

