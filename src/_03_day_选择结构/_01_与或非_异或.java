package _03_day_选择结构;

public class _01_与或非_异或 {
    public static void main(String[] args) {
        // && || ! ^
        int a = 10;
        int b = 20;
        int c = 30;

        //	逻辑与	&	并且	 and	遇false则false
		/*
		System.out.println(a < b & b < c);//	true & true = true
		System.out.println(a < b & b > c);//	true & false = false
		System.out.println(a > b & b < c);//	false & true = false
		System.out.println(a > b & b > c);//	false & false = false
		*/

        //	逻辑或	|	或	or	遇true则true
		/*
		System.out.println(a < b | b < c);//	true | true = true
		System.out.println(a < b | b > c);//	true | false = true
		System.out.println(a > b | b < c);//	false | true = true
		System.out.println(a > b | b > c);//	false | false = false
		*/

        //逻辑异或 	^ 	相异为true，相同为false
		/*
		System.out.println(a < b ^ b < c);//	true ^ true = false
		System.out.println(a < b ^ b > c);//	true ^ false = true
		System.out.println(a > b ^ b < c);//	false ^ true = true
		System.out.println(a > b ^ b > c);//	false ^ false = false
		*/

        //逻辑非	！
        System.out.println(!true);//	false
        System.out.println(!false);//	true

    }
}
