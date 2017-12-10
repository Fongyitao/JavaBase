package _13_day_StringBuffer._06_StringBuffer和String相互转换;

public class StringBuffer和String相互转换 {
    /*
* A:String -- StringBuffer
    * a:通过构造方法
    * b:通过append()方法
* B:StringBuffer -- String
    * a:通过构造方法
    * b:通过toString()方法
    * c:通过subString(0,length);

     */
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("HelloWorld");   // 通过构造方法，将字符串转换成StringBuffer对象
        sb.append("你好");    //通过append方法也可以将字符串转成StringBuffer对象
        System.out.println(sb);

        String s1 = new String(sb);     // 通过String的构造方法可以将StringBuffer转成String
        System.out.println(s1);

        String s2 = sb.toString();  // 通过toString()方法，将StringBuffer转成String
        System.out.println(s2);

        String s3 = sb.substring(0,sb.length()); // 通过subString(0,length);
        System.out.println(s3);


    }
}
