package File演练20220724;
/**
 * 1.对文件进行删除
 * 2. 对目录进行删除
 * 3. 绝对路径和相对路径
 */


import java.io.File;
import java.io.IOException;

public class File删除 {
    public static void main(String[] args) throws IOException {
        // 需求1   在当前路径下，创建对象
        File f1 = new File("javaSE_code\\java.txt");
//        System.out.println(f1.createNewFile());
        //需求2    删除文件
        System.out.println(f1.delete());

//        需求3  创建目录
        File ff = new File("javaSE_code\\Demo");
//        System.out.println(ff.mkdir());

//        需求4  删除目录
        System.out.println(ff.delete());




    }


}
