package _25_day._06_JDK1_5的新特性互斥锁;

public class JDK15的新特性互斥锁 {
    /*
    * 1.同步
    * 使用ReentrantLock类的lock()和unlock()方法进行同步
* 2.通信
    * 使用ReentrantLock类的newCondition()方法可以获取Condition对象
    * 需要等待的时候使用Condition的await()方法, 唤醒的时候用signal()方法
    * 不同的线程使用不同的Condition, 这样就能区分唤醒的时候找哪个线程了

     */
}
