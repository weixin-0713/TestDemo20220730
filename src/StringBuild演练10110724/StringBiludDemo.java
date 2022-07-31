package StringBuild演练10110724;

/**
 *  1.构造方法，
 *  2.appned() 添加方法, 返回对象本身
 *  3.reverse()反转方法
 */

public class StringBiludDemo {
    public static void main(String[] args) {

/**1.构造方法*/
//      创建一个空白的字符串对象(无参构造)
        StringBuilder str = new StringBuilder();
//        打印该字符串
        System.out.println("str:" + str);
//        打印字符串的长度
        System.out.println("str.lenth():" + str.length());


        System.out.println("---------");
        // 创建一个有值对象
        StringBuilder  str2 = new StringBuilder("hello");
//        打印该字符串
        System.out.println("str2:" + str2);
//        打印字符串的长度
        System.out.println("str2.lenth():" + str2.length());


/**appned() 添加方法*/
        System.out.println("---------");
        StringBuilder str3 = new StringBuilder();

        str3.append("Hello");
        str3.append("world");
        str3.append("Java");
        str3.append(1000);
        System.out.println("str3:"+str3);

//        链式编程
        System.out.println("---------");
        StringBuilder str4 = new StringBuilder();
        str4.append("Hello").append("world").append("Java").append(2000);
        System.out.println("str4:"+str4);


        /**反转方法*/
        str4.reverse();
        System.out.println("str4:"+str4);
    }
}
