package _02_day_DataType;

public class _001_DataType {
    public static void main(String[] args) {
        //整数类型
        byte b = 10; 	//占一个字节，-128到127
        short s = 20; 	//占两个字节
        int i =30;		//占4个字节，整数默认的数据类型就是int类型
        long x = 40L; 	//占8个字节,long类型后面加L，因为l太像1了
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(x);

        //浮点类型
        float f = 12.3F;	//占4个字节
        double d = 33.4;	//占8个字节，小数默认类型是double,double类型后面也可以加D或者d
        System.out.println(f);
        System.out.println(d);

        //字符类型
        char c = 'a'; //占两个字节
        System.out.println(c);

        //布尔类型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

//		10
//		20
//		30
//		40
//		12.3
//		33.4
//		a
//		true
//		false

    }
}

