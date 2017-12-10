package _14_day_正则._06_Math类概述;

public class _01_Math概述 {
    /*
* A:Math类概述
    * Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
* B:成员方法
    * public static int abs(int a)
    * public static double ceil(double a)
    * public static double floor(double a)
    * public static int max(int a,int b) min自学
    * public static double pow(double a,double b)
    * public static double random()
    * public static int round(float a) 参数为double的自学,四舍五入
    * public static double sqrt(double a)

     */
    public static void main(String[] args) {

        System.out.println(Math.PI);//3.141592653589793
        System.out.println(Math.abs(-10));//绝对值：10

        //ceil天花板
        System.out.println(Math.ceil(12.3));//13.0 ,向上取整，结果是double
        //floor 底板
        System.out.println(Math.floor(12.3));//12.0,向下取整，结果是double

        System.out.println(Math.max(3,5));//5，获取两个值中的最大值

        //pow 求次幂
        System.out.println(Math.pow(2,3));//8,求次幂，前面是底数，后面的是指数
        System.out.println(2<<2);//8  2乘以2的2次方

        //生成0.0至1.0之间的小数，包括0.0和1.0
        System.out.println(Math.random());//0.6751529034191481

        //四舍五入
        System.out.println(Math.round(12.3f));//12
        System.out.println(Math.round(12.9f));//13

        //sqrt  开平方
        System.out.println(Math.sqrt(4));//2
        System.out.println(Math.sqrt(3));//1.7320508075688772
        System.out.println(Math.sqrt(2));//1.4142135623730951

    }
}
