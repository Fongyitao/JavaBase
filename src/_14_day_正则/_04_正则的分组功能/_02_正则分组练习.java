package _14_day_正则._04_正则的分组功能;

public class _02_正则分组练习 {
    /*
    a:切割
        需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
    b:替换
        需求：没..没没.有有...有人不爱惜他的生.生命...命，但很少人珍视他的时间。 —— 梁实秋
        将字符串还原成:“没有人不爱惜他的生命，但很少人珍视他的时间。 —— 梁实秋”
     */
    public static void main(String[] args) {
//        demo1_切割();
        /*
        b:替换
        需求：没..没没.有有...有人不爱惜他的生.生命...命，但很少人珍视他的时间。 —— 梁实秋
        将字符串还原成:“没有人不爱惜他的生命，但很少人珍视他的时间。 —— 梁实秋”
         */
        String s = "没..没没.有有...有人不爱惜他的生.生命...命，但很少人珍视他的时间。 —— 梁实秋";
        String s2 = s.replaceAll("\\.","");
        System.out.println(s2);//没没没有有有人不爱惜他的生生命命，但很少人珍视他的时间。 —— 梁实秋
        String s3 = s2.replaceAll("(.)\\1+","$1");
        System.out.println(s3);

    }

    private static void demo1_切割() {
        //a:切割  需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
        String s = "sdqqfgkkkhjppppkl";
        String regex = "(.)\\1+";   //+代表出现一次到多次
        String[] arr = s.split(regex);
        for (String a :
                arr) {
            System.out.println(a);
        }
    }
}
