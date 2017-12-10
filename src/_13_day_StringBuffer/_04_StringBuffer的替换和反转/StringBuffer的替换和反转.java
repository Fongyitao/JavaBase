package _13_day_StringBuffer._04_StringBuffer的替换和反转;

public class StringBuffer的替换和反转 {
    /*
* A:StringBuffer的替换功能
    * public StringBuffer replace(int start,int end,String str):
        * 从start开始到end用str替换
* B:StringBuffer的反转功能
    * public StringBuffer reverse():
        * 字符串反转

     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("HelloWorld");
        sb.replace(0,5,"Hi");
        System.out.println(sb); // HiWorld

        sb.reverse();
        System.out.println(sb); //dlroWiH
    }
}
