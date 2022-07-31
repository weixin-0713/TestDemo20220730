package OutputStream输出流20220724;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * 目标： 学习输出流
 * 步骤：
 * 1.创建字节输出流对象
 * 2. 通过写方法写数据
 * 3. 关闭资源
 */

public class OutPutStream演练 {
    public static void main(String[] args) throws IOException {
//        创建字节流对象
        FileOutputStream f = new FileOutputStream("javaSE_code\\test1.txt");
/***
 * 上面这段代码做了三件事：
 * 1.调用系统功能创建了文件
 * 2.创建了字节流对象
 * 3.让字节输出流对象指向创建好的文件
 */


//        通过写入方法写入数据。
        f.write(97);

//        关闭资源连接
        f.close();

    }
}
