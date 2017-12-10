package _21_day_字符流._12_递归;

public class 递归 {
    //求5！
    // 递归：方法自己调用自己
    public static void main(String[] args) {

        System.out.println(fun(30));
    }
    public static int fun(int num){
        if (num == 1){
            return 1;
        }else {
            return num * fun(num - 1);
        }
    }
}
