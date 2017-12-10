package _26_day._06_UDP传输;

public class UDP传输 {
    /*
* 1.发送Send
    * 创建DatagramSocket, 随机端口号
    * 创建DatagramPacket, 指定数据, 长度, 地址, 端口
    * 使用DatagramSocket发送DatagramPacket
    * 关闭DatagramSocket
* 2.接收Receive
    * 创建DatagramSocket, 指定端口号
    * 创建DatagramPacket, 指定数组, 长度
    * 使用DatagramSocket接收DatagramPacket
    * 关闭DatagramSocket
    * 从DatagramPacket中获取数据
* 3.接收方获取ip和端口号
    * String ip = packet.getAddress().getHostAddress();
    * int port = packet.getPort();

     */
}
