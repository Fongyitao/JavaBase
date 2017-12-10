package _16_day_泛型._06_泛型类的概述及使用;

public class Tool<E> {          //泛型类
    private E e;

    public Tool(){}
    public Tool(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E d) {
        this.e = e;
    }

    public void show(E e){
        System.out.println(e);
    }

    public<T> void sayHi(T t){  //泛型方法  如果方法泛型类型和类的泛型不一致，需要在方法上声明该泛型
        System.out.println(t);
    }

    public static<W> void pirnt(W w){ //静态方法必须声明自己的泛型，不能
        System.out.println(w);
    }
}
