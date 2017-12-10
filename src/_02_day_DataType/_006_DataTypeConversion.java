package _02_day_DataType;

public class _006_DataTypeConversion {
    public static void main(String[] args) {
        System.out.println('a' + 1);//结果是98
        /**
         * 当字符char和int进行运算的时候，会将char隐式提升为int进行运算
         * 故结果为98，a字符就是97
         * ASCII码表
         */
        System.out.println((char)('a'+1));// 结果是b

        System.out.println("Hello"+'a'+1);//结果：Helloa1
        // 任何数据类型用+与字符串相连接都会产生新的字符串
        System.out.println("5+5="+5+5);//结果为：5+5=55

        System.out.println("5+5="+(5+5));//结果为：5+5=10

    }
}

