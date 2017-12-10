package _13_day_StringBuffer._09_数组高级排序;

public class 数组冒泡排序 {
    /*
需求：
    数组元素：{24, 69, 80, 57, 13}
    请对数组元素进行排序。

    冒泡排序
        相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处

     */
    public static void main(String[] args) {

        int[] arr = {24, 69, 80, 57, 13};
        冒泡排序(arr);  //13	24	57	69	80
    }

    //冒泡排序
    private static void 冒泡排序(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) { // 外循环只需要比较arr.length-1次就够了
            for (int j = 0; j < arr.length -1-i; j++) { // -1是为了防止索引越界，-i是为了提高效率
                if (arr[j] > arr[j + 1]){
                    /*
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                     */
                    swap(arr, j,j+1);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static void swap(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
