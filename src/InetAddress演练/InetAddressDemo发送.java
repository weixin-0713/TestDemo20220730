package InetAddress演练;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo发送 {
    public static void main(String[] args) throws UnknownHostException {

//方法1     getByName()  通过设备名称获取其IP地址和设备名称
        InetAddress  address = InetAddress.getByName("Desk-ChenJ");
//        InetAddress  address = InetAddress.getByName("192.168.173.1");
//        System.out.println(address);

//方法2   getHostName() 获取主机的名称
        String  name = address.getHostName();
        System.out.println("主机名称："+name);
//方法3  getHostAddress() 获取主机的IP地址
        String  ip = address.getHostAddress();
        System.out.println("主机ip："+ip);


    }
}
