package _12_day_String._08_字符串遍历;

public class 字符串遍历 {
    /**
     * 字符串遍历
     */
    public static void main(String[] args) {
        String s = "Hello World";
        for (int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i)); // 通过索引获取每一个char字符
        }
    }
}
