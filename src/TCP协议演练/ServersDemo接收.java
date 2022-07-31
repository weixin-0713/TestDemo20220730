package TCP协议演练;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *目标：服务端接收数据，给出反馈
 * 步骤：
 * 1.创建服务端的socket 对象
 * 2.监听客户端连接。返回一个socket 对象
 * 3.获取输入流，读取数据，并把信息显示再控制台
 * 4.释放资源
 *
 * */

public class ServersDemo接收 {
    public static void main(String[] args) throws IOException {
//       创建服务端的socket 对象
        ServerSocket acep = new ServerSocket(10000);

//       监听客户端连接。返回一个socket 对象
        Socket ss = acep.accept();
//      获取输入流，读取数据，并把信息显示再控制台
        InputStream info = ss.getInputStream();
        byte[]  bys = new byte[1024];
        int len = info.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器端："+ data);

//        给出反馈
        OutputStream os = ss.getOutputStream();
        os.write("我是服务器，数据已经收到".getBytes());

//        释放资源

        acep.close();
//        ss.close();





    }
}
