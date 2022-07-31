package Collection演练;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
//        创建集合对象
        Collection<String>  c = new ArrayList<String>();

//        add() 方法,添加元素
        c.add("Hello");
        c.add("world");
        c.add("Java");

//        输出集合
        System.out.println(c);


    }
}
