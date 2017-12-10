package _12_day_String._12_把数组转成字符串;

public class 把数组转成字符串 {
    /**
     * 把数组中的数据按照指定格式拼接成一个字符串
     * 举例：
     *      int[] arr = {1,2,3};
     *  输出结果：
     *      "[1,2,3]"
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                s = s + arr[i] + "]";
            }else {
                s  = s + arr[i] + ",";
            }
        }

        System.out.println(s); // [1,2,3]
    }
}
