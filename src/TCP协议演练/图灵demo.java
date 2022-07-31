package TCP协议演练;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class 图灵demo {

    public static void main(String[] args) throws IOException {

//        通过循环询问
        while (true){

        // TODO Auto-generated method stub
        System.out.println("请输入信息：");
        Scanner sc = new Scanner(System.in);
        String que = sc.nextLine();
        if (!que.equals("88")){

        //将发送给图灵机器人的文字转换为URL编码
        String question = URLEncoder.encode(que,"UTF-8");
        //1、先准备一个URL类的对象（网址）
        //发送短信的api地址
        //URL url = new URL("https://itdage.com/kkb/kkbsms?key=xzk&number=15779608136&code=521314");
        //图灵机器人的API地址
        URL url = new URL("https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question="+question);
        //2、连接服务器:打开服务器连接，得到对象conn
        URLConnection conn = url.openConnection() ;
        //3、加载数据：获取加载数据的字节输入流
        InputStream is = conn.getInputStream() ;
        //4、将is装饰为能一次读取一行的字符输入流br
        //BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        //5、加载一行数据
        String text = br.readLine() ;


        //6、显示
        System.out.println(text);
        //7、释放资源
        br.close() ;
        }else
//            System.out.println("交流结束，谢谢！");
            break;


        }
}
}
