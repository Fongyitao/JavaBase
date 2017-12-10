package _13_day_StringBuffer._12_基本类型包装类;

public class Integer面试题 {
    public static void main(String[] args) {
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);       //false
        System.out.println(i1.equals(i2));  //true
        System.out.println("-----------");

        Integer i3 = new Integer(197);
        Integer i4 = new Integer(197);
        System.out.println(i3 == i4);       //false
        System.out.println(i3.equals(i4));  //true
        System.out.println("-----------");

        Integer i5 = 97;
        Integer i6 = 97;
        System.out.println(i5 == i6);       //true
        System.out.println(i5.equals(i6));  //true
        System.out.println("-----------");

        Integer i7 = 197;
        Integer i8 = 197;
        System.out.println(i7 == i8);       //fales
        System.out.println(i7.equals(i8));  //true

        /*
        -128到127是byte的取值范围，如果在这个取值范围内，
        自动装箱就不会创建对象，而是从常量池中获取，
        如果超过了byte取值范围，就会再创建对象
         */
    }
}
