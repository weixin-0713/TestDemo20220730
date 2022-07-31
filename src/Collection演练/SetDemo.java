package Collection演练;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
//        创建集合对象
        Set<String>  set = new HashSet<String>();

//        add()  添加方法
        set.add("Hello");
        set.add("world");
        set.add("Java");

//        增强迭代器
        for (String s:set){
            System.out.println(s);
        }



    }

}
