package _19_day_异常._01_异常;

public class 案例演示 {
    public static void main(String[] args) {

        Demo d = new Demo();
        int x = d.div(10,0);
        System.out.println(x);

    }
}

class Demo{
    /*
    除法运算
     */
    public int div(int a,int b){
        return a/b;
    }
}