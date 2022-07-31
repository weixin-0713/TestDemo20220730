package TCP协议演练;
/**
 *  目标： 客户端发送请求，服务端接收请求
 *  步骤：1.创建socket 对象
 *  2.获取输出流，写入数据
 *  3.释放资源
 *
 * */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo发送 {
    public static void main(String[] args) throws IOException {
//        创建客户端的socket 对象
        Socket s= new Socket("127.0.0.1",10000);

//        获取输出流，写入数据
        OutputStream outinfo = s.getOutputStream();
        outinfo.write("hello,TCP,你好我来了，我是客户端".getBytes());

//        接收服务器的返回
        InputStream  is=  s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String  data = new String(bys,0,len);
        System.out.println("客户端:"+data);



//        释放资源；
        s.close();

    }
}
