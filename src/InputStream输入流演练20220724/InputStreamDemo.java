package InputStream输入流演练20220724;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取文件
 */

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建输入流对象
        FileInputStream  fis = new FileInputStream("javaSE_code\\test03");


//        读取文件
        // 方法1 读取1个字节
//        int by = fis.read();
//        System.out.println(by);
//
        // 方法2  优化上述方法，通过循环读取文件
        System.out.println("---------");
        int by1;

        while ((by1 = fis.read()) != -1 ){
            System.out.print((char) by1);  // 备注：此处不用换行
        }

//        释放资源
        fis.close();

    }
}
