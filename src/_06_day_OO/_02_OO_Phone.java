package _06_day_OO;

public class _02_OO_Phone {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "HUAWEI";
        p.price = 2000;
        p.call();
        p.sendMessage();
        p.playGame();

    }

}
class Phone{
    String brand;// 品牌
    int price;// 价格

    public void call() {
        System.out.println("打电话");
    }
    public void sendMessage() {
        System.out.println("发信息");
    }
    public void playGame() {
        System.out.println("玩游戏");
    }
}
