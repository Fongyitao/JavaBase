package _05_day_Array;

public class _01_Array {
    public static void main(String[] args) {
        // 数据类型[] 数组名 = new 数据类型[数组长度];
        int[] arr = new int[5];// 动态初始化，在内存中开辟连续的5块空间
		/*
		 * 左边：
		 * int:数据类型
		 * []:代表的数组，几个中括号就代表几维度数组
		 * arr:合法的标识符
		 *
		 * 右边：
		 * new：创建新的实体或对象
		 * int：数据类型
		 * []：代表的数组
		 * 5：代表数组长度
		 */

        System.out.println(arr[0]);// 整数系统初始化值为0
		/*
		 * 整数类型：byte、short、int、long 默认初始化值都是0
		 * 浮点类型：float、double默认初始化值是0.0
		 * 布尔类型：Boolean默认是false
		 * 字符类型：char默认初始化值是'\u0000' u代表Unicode转义，char在内存中占两个字节，是16个二进制位，
		 * \u0000，每个0其实代表的是16进制的0，那么4个0就是代表16个二进制位
		 */
        System.out.println(arr);// [I@dcf3e99
		/*
		 * [：代表是数组，几个就代表几维
		 * I：代表是int类型
		 * @：固定的
		 * dcf3e99：代表的是16进制的地址值
		 */

    }
}
