package _13_day_StringBuffer._03_StringBuffer的删除功能;

public class StringBuffer的删除功能 {
/**
 * * A:StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index):
 * 删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end):
 * 删除从指定位置开始指定位置结束的内容，并返回本身

 */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
//        sb.deleteCharAt(5); // 当缓冲区中这个索引上没有元素的时候就会报StringIndexOutOfBoundsException的异常

        sb.append("Hello");
//        sb.deleteCharAt(3); // 根据索引删除索引位置上的字符

//        sb.delete(0,2); // 删除的时候，包含头，不包含尾

//        sb.delete(0,sb.length());//清空缓冲区


        System.out.println(sb.toString());

    }
}
