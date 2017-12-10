package _23_day_递归练习;

import java.util.ArrayList;

public class _08_约瑟夫环 {
    /*
    * 幸运数字
    * 约瑟夫环
     */
    public static void main(String[] args) {
        int luckNum = get_luck_num(7);
        System.out.println(luckNum);

    }

    /*
    获取幸运数字
    返回值int
    参数列表int
     */
    public static int get_luck_num(int num) {
        ArrayList<Integer> list = new ArrayList<>(); //创建集合存储1到num的对象
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }

        int count = 1; // 计数，只要是3的倍数就移除
        for (int i = 0; list.size() != 1; i++) { // 只要集合中人数超过1，就要不断移除
            if (i == list.size() - 1) {  // 如果i增长到最大集合-1是，重新归零
                i = 0;
            }
            if (count % 3 == 0) {
                list.remove(i--);
            }
            count++;
        }
        return list.get(0);
    }

}
