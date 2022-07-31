package File演练20220724;

import java.io.File;
import java.util.ArrayList;

public class File类判断和获取 {
    public static void main(String[] args) {
//      创建对象
        File f = new File("D:\\Temp\\java.txt");

//        调用对应的方法
        System.out.println(f.isFile()); // 返回ture
        System.out.println(f.isDirectory());  // 返回 false
        System.out.println(f.exists()); // 返回 返回ture

        System.out.println("---------");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.getPath());


        System.out.println("---------其它方法");
         File f1 = new File("D:\\Temp");

        String[]  arr1 = f1.list();
//        增强for 遍历
        for (String file:arr1){
            System.out.println(file);
        }
        System.out.println("**********");
        File [] ff = f1.listFiles();
        for (File file:ff) {
            if (file.isDirectory()) {
                System.out.println("打印目录：" + file);
            }if (file.isFile()){
                System.out.println("打印文件：" + file);
            }
        }

    }
}
