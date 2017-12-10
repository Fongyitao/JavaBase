package _13_day_StringBuffer._02_StringBuffer的添加功能;

public class StringBuffer的insert {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("123");
        sb1.insert(1,"Hello");  // 在指定位置添加元素，如果没有指定位置就会抛索引越界异常
        System.out.println(sb1.toString()); // 1Hello23
    }
}
