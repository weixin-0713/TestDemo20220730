package Collection演练;

import java.util.Collection;
import java.util.LinkedList;

public class LinklistDemo {
    public static void main(String[] args) {
//      创建集合对象
        LinkedList<String> c= new LinkedList<String>();

//   addfirst() 、 addlast() 、
        c.addFirst("Hello");
        c.addLast("world");
        c.addLast("java");
        c.addLast("测试");

//        打印集合
        System.out.println(c);

//  removeLast()  removeFirst()
        c.removeLast();
        c.removeFirst();
        System.out.println(c);

//      getLast()方法  getFirst()
        System.out.println(c.getLast());
        System.out.println(c.getFirst());


    }
}
