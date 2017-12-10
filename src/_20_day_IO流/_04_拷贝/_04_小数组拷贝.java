package _20_day_IO流._04_拷贝;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_小数组拷贝 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("xxx.txt");
        byte[] arr = new byte[2];
        int a = fis.read(arr);

        System.out.println(a);//2
        for (byte b : arr) {
            System.out.println(b);
        }
        /*
        97
        98
         */
        System.out.println("-----");
        while (fis.read(arr) != -1){
            //System.out.println(a);
            for (byte b : arr) {
                System.out.print(b + " ");
            }
        }
        //99 100 65 66 67 68

        fis.close();

    }
}
