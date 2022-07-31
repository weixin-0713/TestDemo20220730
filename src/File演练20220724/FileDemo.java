package File演练20220724;

import java.io.File;

/***
 * file()类 ---总共3种
 */


public class FileDemo {
    public static void main(String[] args) {
//  方法1   构造方法
        File   f = new File("D:\\Temp\\java.txt");
        System.out.println(f);

//  方法2   构造方法
        File   f1 = new File("D:\\Temp","java.txt");
        System.out.println(f1);

        //  方法3   构造方法

        File  f2  = new File("D:\\Temp");
        File  f3  = new File(f2,"java.txt");
        System.out.println(f3);

    }
}
