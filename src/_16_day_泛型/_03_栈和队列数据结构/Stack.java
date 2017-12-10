package _16_day_泛型._03_栈和队列数据结构;

import java.util.LinkedList;

public class Stack {
    private LinkedList list = new LinkedList();

    /*
    模拟进栈方法
     */
    public void inStack(Object obj){
        list.addLast(obj);
    }

    /*
    模拟出栈方法
     */
    public Object outStack(){
        return list.removeLast();
    }

    /*
    模拟栈结构是否为空
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
