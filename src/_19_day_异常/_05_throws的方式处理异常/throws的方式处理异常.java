package _19_day_异常._05_throws的方式处理异常;

public class throws的方式处理异常 {
    /*
    * A:throws的方式处理异常
    * 定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
    * 那么就通过throws在方法上标识。
* B:案例演示
    * 举例分别演示编译时异常和运行时异常的抛出

编译时异常的抛出：必须对其进行处理
运行时异常的抛出，可以处理也可以不处理
     */
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setAge(-17);
        System.out.println(p.getAge());
    }
}
