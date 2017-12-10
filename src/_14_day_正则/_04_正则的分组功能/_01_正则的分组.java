package _14_day_正则._04_正则的分组功能;

public class _01_正则的分组 {
    /*
    * A:正则表达式的分组功能
    * 捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组：
*
        1     ((A)(B(C)))
        2     (A
        3     (B(C))
        4     (C)

        组零始终代表整个表达式。

     */
    public static void main(String[] args) {
        // 叠词  高高兴兴  快快乐乐
//        demo1();

        //叠词  高兴高兴  彼此彼此
        String regex = "(..)\\1";
        System.out.println("彼此彼此".matches(regex)); //true
        System.out.println("高高兴兴".matches(regex)); //false


    }

    // 叠词  高高兴兴  快快乐乐
    private static void demo1() {
        String regex = "(.)\\1(.)\\2"; // \\1代表第一组又出现一次   \\2代表第二组又出现一次

        System.out.println("高高兴兴".matches(regex)); //true
        System.out.println("高兴高兴".matches(regex)); //false
    }
}
