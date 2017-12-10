package _13_day_StringBuffer._07_StringBuffer练习;

public class 把数组转成字符串 {
    /**
     * 需求：把数组中的数据按照指定的格式拼接成字符串
     * 举例：
     *  int[] arr = {1,2,3};
     * 输出结果：
     *  "[1,2,3]"
     *
     *  用StringBuffer的功能实现
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        String s = arrayToString(arr);
        System.out.println(s); // [1,2,3,4,5,6,7]
    }

    //StringBuffer用的内存更小，效率更高
    private static String arrayToString(int[] arr) {

        StringBuffer sb = new StringBuffer("["); //创建缓冲区，并把 "[" 放到缓冲区
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }

        return sb.toString();
    }

}
