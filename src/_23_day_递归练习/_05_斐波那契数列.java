package _23_day_递归练习;

public class _05_斐波那契数列 {
    /*
    * 不死神兔
    * 故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
    * 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡，
    * 问：一对刚出生的兔子，一年内繁殖成多少对兔子?
    * 1 1 2 3 5 8 13
    * 第一个月一对小兔子                    1
    * 第二个月一对大兔子                    1
    * 第三个月一对大兔子生了一对小兔子        2
    * 第四个月一对大兔子生了一对小兔子
    *          一对小兔子长成大兔子            3
    * 第五个月两对大兔子生两对小兔子
    *          一对小兔子长成大兔子            5
     */
    public static void main(String[] args) {
        fibonacci_sequence1(8);  // 21
        System.out.println(fibonacci_sequence2(8)); // 21
    }

    //用数组实现斐波那契数列
    public static void fibonacci_sequence1(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2;i < arr.length; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println(arr[arr.length - 1]);
    }

    //递归实现斐波那契数列
    public static int fibonacci_sequence2(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return fibonacci_sequence2(n -2) + fibonacci_sequence2(n -1);
        }
    }
}
