package _14_day_正则._01_正则表达式概述;

import java.util.Scanner;

public class _01_正则概述_qq校验 {
    /*
* A:正则表达式
    * 是指一个用来描述或者匹配一系列符合某个语法规则的字符串的单个字符串。其实就是一种规则。有自己特殊的应用。
    * 作用:比如注册邮箱,邮箱有用户名和密码,一般会对其限制长度,这个限制长度的事情就是正则表达式做的
* B:案例演示
    * 需求：校验qq号码.
        * 1:要求必须是5-15位数字
        * 2:0不能开头
        * 3:必须都是数字

    * a:非正则表达式实现
    * b:正则表达式实现

     */
    public static void main(String[] args) {
        System.out.print("请输入qq号：");
        Scanner sc = new Scanner(System.in);
        String qq = sc.nextLine();
        boolean b = checkQQ(qq);
        System.out.println(b);
    }
    /*
    * 需求：校验qq号码.
        * 1:要求必须是5-15位数字
        * 2:0不能开头
        * 3:必须都是数字
        *
        * 1、明确返回值类型boolean
        * 2、明确参数类型String qq
     */
    private static boolean checkQQ(String qq){
        boolean flag = false;   // 如果校验qq不符合要求就把flag置为false，符合就置为true
        if (qq.length() >= 5 && qq.length() <=15){
            if (!qq.startsWith("0")){
                char[] arr = qq.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char ch = arr[i];   // 记录每个字符
                    if (!(ch >= '0' && ch <= '9')){
                        flag = false;
                        break;
                    }else {
                        flag = true;
                    }
                }
            }else {
                flag = false;
                System.out.println("qq号不能以0开头");
            }
        }else {
            flag = false;
            System.out.println("长度不符合");
        }

        return flag;
    }

}
