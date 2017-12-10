package _02_day_DataType;

public class _07_Char {
    public static void main(String[] args) {
        char c ='a';
        System.out.println(c);//结果为：a

        char c1 = 97;
        System.out.println(c1);//结果为：a

        /**
         * char 的取值范围：0——65535
         */

        char c2 = 3;
        char c3 = 4;
        char c4 = 5;
        char c5 = 6;

        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        //char类型是否可以存储中文
        char c6 = '中';
        System.out.println(c6);
        //Java是Unicode编码，每个字符占两个字节，一个中文也是占两个字节，故Java中char类型可存一个中文

    }
}