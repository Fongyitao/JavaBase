package _17_day_HashSet_TreeSet._06_练习;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class _03_键盘接收多个字符串 {
    /*
    * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1:-num;
            }
        });

        while (true){
            System.out.println("请输入多个整数（quit退出）：");
            String line = sc.nextLine();
                if("quit".equals(line)) {
                    break;
                }else{
                    int i = Integer.valueOf(line);
                    ts.add(i);
                }

        }
        System.out.println(ts);

    }
}
