package OutputStream输出流20220724;

import java.io.*;

/**
 * 目标：
 * 1. 2种构造方法
 *      FileOutputStream（String name）
 *      FileOutputStream (File file)
 * 2. 三种写入方式
 *      a.   写入1个
 *      b.   写入1个字符数组
 *      c.   写入字符数组部分
 */


public class OutputStreamWriteDemo {
    public static void main(String[] args) throws IOException {
//       第1种构造方法
//        创建输出流对象
//        FileOutputStream fos = new FileOutputStream("javaSE_code\\fos.txt");  // 方法1

//       上面的代码实际上等于下面这句
        FileOutputStream  fos = new FileOutputStream(new File("javaSE_code\\fos.txt"));  // 方法2

//        第2种构造方法
        File  f = new File("javaSE_code\\fos2.txt");
        FileOutputStream fos2= new FileOutputStream(f);


//三种写入方式
//        写入一个字节
//          fos.write(97);
//        写入一个字符数组
        byte[] bys ={97,98,99,100};
        fos2.write(bys);

//        写入数组部分
        byte[] bytes = "abcde".getBytes();
        fos.write(bytes,1,3);

//        注意关闭资源
        fos.close();
        fos2.close();

    }
}
