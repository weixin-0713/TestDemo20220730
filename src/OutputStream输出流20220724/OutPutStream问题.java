package OutputStream输出流20220724;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * 目标：
 * 1. 写入数据如何换行
 *      windows系统： \r\n
 *      liunx系统： \n
 *      mac 系统： \r
 * 2. 写入数据如何追加
 *      可以给构造函数，添加第2个参数， 默认是 false
 *
 */

public class OutPutStream问题 {
    public static void main(String[] args) throws IOException {
//        创建输出流对象
//        FileOutputStream fos = new FileOutputStream("javaSE_code\\test02");
        FileOutputStream fos = new FileOutputStream("javaSE_code\\test02",true);

//        通过循环写入信息
        for (int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());

        }


//        释放资源
        fos.close();
    }

}
