package _09_day_多态._04_多态利弊;

public class _04_多态利弊 {

    public static void main(String[] args) {
//		Cat c1 = new Cat();
//		c1.eat();
//		c1.catchMouse();

        method(new Cat());
		/*
		猫吃鱼
		抓老鼠
		 */
        System.out.println("-----------------");
        method(new Dog());
		/*
		狗吃肉
		看家
		 */
    }
    public static void method(Animal a) {
        // 关键字，instanceof 判断前面的引用是否是后面的数据类型
        if(a instanceof Cat) {
            Cat c = (Cat)a;
            c.eat();
            c.catchMouse();
        }else if (a instanceof Dog) {
            a.eat();
            ((Dog)a).lookHome();
        }else {
            a.eat();
        }
    }
}

/*
*A：多态的好处
     *a：提高了代码的维护性（继承保证）
     *b：提高了代码的扩展性（由多态保证）
*B：案例演示
     *多态的好处
     *可以当做形式参数，可以接收任意子类对象
*C：多态的弊端
     *不能使用子类的特有属性和行为。
 */

class Animal{
    public void eat() {
        System.out.println("动物吃食物");
    }
}

class Cat extends Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal{
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void lookHome() {
        System.out.println("看家");
    }
}
