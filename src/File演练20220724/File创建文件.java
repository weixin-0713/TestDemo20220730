package File演练20220724;
/***
 * 创建文件
 * 方法1 createNewFile(), 若待创建的文件文件不存在，则返回ture ,若存不创建，并返回 false
 * 方法2 mkdir() ，若待创建的文件目录不存在，则返回ture ,若存不创建则返回 false
 * 方法3 mkdirs()  创建多级目录
 */

import java.io.File;
import java.io.IOException;

public class File创建文件 {
    public static void main(String[] args) throws IOException {
//        创建文件对象
//        方法1  createNewFile()
        File  f = new File("D:\\Temp\\java.txt");
        f.createNewFile();
        System.out.println(f);

//        创建文件目录
        System.out.println("---------");
        File  f1  = new File("D:\\Temp\\Test");
        f1.mkdir();
        System.out.println(f1);

//        创建多级目录
        System.out.println("---------");
        File  f2 = new File("D:\\Temp\\Test01\\HTML");
        System.out.println(f2.mkdirs());


    }
}
