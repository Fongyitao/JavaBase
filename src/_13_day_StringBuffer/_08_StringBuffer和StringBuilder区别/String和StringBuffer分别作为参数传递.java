package _13_day_StringBuffer._08_StringBuffer和StringBuilder区别;

public class String和StringBuffer分别作为参数传递 {
    /*
 * A:形式参数问题
    * String作为参数传递
    * StringBuffer作为参数传递 

基本数据类型的传递，不改变其值
引用数据类型的传递，改变其值

String类虽然是引用数据类型，但是当它当做参数传递时和基本数据类型是一样的
     */
    public static void main(String[] args) {
        String s = "Hello";
        change(s);
        System.out.println(s);//Hello

        StringBuffer sb = new StringBuffer("你好");
        System.out.println(sb);//你好
        change(sb);
        System.out.println(sb);// 你好世界
    }

    private static void change(StringBuffer sb) {
        sb.append("世界");
    }

    private static void change(String s) {
        s += " World";
    }
}
