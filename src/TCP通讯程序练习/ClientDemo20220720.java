package TCP通讯程序练习;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.BindException;
import java.net.Socket;

/**
 * 目标：客户端 数据来源自键盘录入，直接到输入的数据是886，发送数据结束
 *
 * */

public class ClientDemo20220720 {
    public static void main(String[] args) throws IOException {
//        创建socket 对象
        Socket s = new Socket("127.0.0.1",10000);

//       数据来源自键盘录入，直接到输入的数据是886，发送数据结束
        InputStream  str = System.in;

        BufferedInputStream i0 = new BufferedInputStream(str);
//        BindException  ou = new ByteArrayOutputStream();
        String  strinfo;






    }
}
