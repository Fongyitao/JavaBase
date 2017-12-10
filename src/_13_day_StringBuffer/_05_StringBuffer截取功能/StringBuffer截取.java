package _13_day_StringBuffer._05_StringBuffer截取功能;

public class StringBuffer截取 {
    /*
* A:StringBuffer的截取功能
    * public String substring(int start):
        * 从指定位置截取到末尾
    * public String substring(int start,int end):
        * 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
* B:注意事项
    * 注意:返回值类型不再是StringBuffer本身，而是String类型

     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloWorld");

        String s1 = sb.substring(5);// 截取，包含头，不包含尾
        System.out.println(s1); // World

        String s2 = sb.substring(5,6);
        System.out.println(s2);
    }
}
