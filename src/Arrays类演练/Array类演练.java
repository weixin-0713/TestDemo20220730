package Arrays类演练;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array类演练 {
    public static void main(String[] ars){
//        定义一个数组
        int[] i= {0,3,15,1,16};

//        使用Arrays 类
        System.out.println("排序前是："+ Arrays.toString(i));
        Arrays.sort(i);
        System.out.println("排序后是："+ Arrays.toString(i));

    }
}
