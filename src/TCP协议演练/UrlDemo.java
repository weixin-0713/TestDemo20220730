package TCP协议演练;

import com.sun.corba.se.impl.resolver.INSURLOperationImpl;
import netscape.javascript.JSObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlDemo {
    public static void main(String[] args) throws IOException {

        String  question ="电脑";
//        创建连接对象
//        URL url = new URL("https://www.baidu.com/");
        URL url = new URL("https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question="+question);

//        连接服务器
        URLConnection  conn = url.openConnection();

//        获取加载数据流
        InputStream   is = conn.getInputStream();

//        对获取的数据流进行装饰

        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

//        加载数据，并将其保存在字符串中

        String  str =  br.readLine();
//        将json 字符串转化为json对象

//        打印信息
        System.out.println(str);



    }
}
