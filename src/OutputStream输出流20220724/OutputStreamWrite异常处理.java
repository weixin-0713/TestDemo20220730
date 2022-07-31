package OutputStream输出流20220724;

import jdk.nashorn.internal.objects.NativeError;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWrite异常处理 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            // 创建输出流对象
//            fos = new FileOutputStream("javaSE_code\\test03");  // 正常情况
            fos = new FileOutputStream("z:\\javaSE_code\\test03");  // 异常情况
            // 输出流写入数据
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
