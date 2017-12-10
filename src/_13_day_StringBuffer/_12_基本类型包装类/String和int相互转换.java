package _13_day_StringBuffer._12_基本类型包装类;

public class String和int相互转换 {
    /*
* A:int -- String
    * a:和""进行拼接
    * b:public static String valueOf(int i)
    * c:int -- Integer -- String(Integer类的toString方法())
    * d:public static String toString(int i)(Integer类的静态方法)
* B:String -- int
    * a:String -- Integer -- int
    * public static int parseInt(String s)
    * public static Integer valueOf(String s)

     */
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = String.valueOf(i1);

        String s2 = i1 + "";

        String s3 = Integer.toString(i1);

        Integer i4 = new Integer(i1);
        String s4 = i4.toString();

        String s5 = "200";
        int i5 = Integer.valueOf(s4);
        int i51 = Integer.parseInt(s5);

        //基本数据类型有八种，其中7种都有parseXxx的方法,Charaacter中没有
        String s6 = "false";
        boolean b6 = Boolean.valueOf(s6);
        boolean b61 = Boolean.parseBoolean(s6);


    }
}
