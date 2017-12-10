package _12_day_String._09_统计不同类型字符个数;

public class 统计不同类型字符个数 {
    /**
     * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数，其他字符出现的次数
     * "AbCDEaBc123!哈哈￥"
     * 分析：字符串由字符组成，而字符的值都是有范围的
     * 通过范围来判断是否包含该字符
     * 若包含就让计数器自增
     */
    public static void main(String[] args) {

        String s = "AbCDEaBc123!$%";
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 通过索引获取每一个字符

            // 判断字符是否在范围
            if (c >= 'A' && c <= 'Z') {
                big ++;
            }else if (c >= 'a' && c <= 'z'){
                small ++;
            }else if (c >= '0' && c <= '9'){
                num ++;
            }else {
                other ++;
            }
        }
        System.out.println("大写字母：" + big);
        System.out.println("小写字母：" + small);
        System.out.println("数字字符:" + num);
        System.out.println("其他字符：" + other);
    }
}
