package itheima2接口演练;

public class interfaceDemo {
    public static void main(String[] args){
        Inter i = new InterImpl();
        System.out.println(i.num);
//        i.num = 30;    // 接口中的成员变量都是常量，无法进行再次赋值
        System.out.println(i.unm1);
        System.out.println("----------");
        System.out.println(Inter.num);
        System.out.println(Inter.unm1);
//  调用成员方法
        i.show();

    }
}
