package _13_day_StringBuffer._10_二分查找;

public class 二分查找 {
    /*
    前提：数组元素有序
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,100,110,120};
        int index = getIndex(arr,66);
        System.out.println(index);
    }

    /*
    二分查找：
        1、返回值类型：int
        2、参数列表int[] arr,int value
     */
    private static int getIndex(int[] arr,int value){
        int min = 0;
        int max = arr.length -1;
        int mid = (min + max) >>> 1; //右移一位，即  (min + max)/2

        while (arr[mid] != value){
            if (arr[mid] < value){
                min = mid + 1;
            }else if (arr[mid] > value){
                max = mid -1;
            }
            mid = (min + max)/2;
            if (min > max){
                return -1;
            }
        }
        return mid;
    }
}
