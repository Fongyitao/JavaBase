package _25_day._07_线程组的概述和使用;

public class 线程组的概述和使用 {
    /*
    * A:线程组概述
    * Java中使用ThreadGroup来表示线程组，它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
    * 默认情况下，所有的线程都属于主线程组。
        * public final ThreadGroup getThreadGroup()//通过线程对象获取他所属于的组
        * public final String getName()//通过线程组对象获取他组的名字
    * 我们也可以给线程设置分组
        * 1,ThreadGroup(String name) 创建线程组对象并给其赋值名字
        * 2,创建线程对象
        * 3,Thread(ThreadGroup?group, Runnable?target, String?name)
        * 4,设置整组的优先级或者守护线程
     */
}
