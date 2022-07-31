package Math工具类演练;

public class Math类 {
    public static void  main(String[] args){
//        Math 绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------");

//        ceil 返回的是double 型, 返回的大于或者等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.14));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");

//  floor 返回的是double 型, 返回的小于或者等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.14));
        System.out.println(Math.floor(12.56));
        System.out.println("--------");

//        round  按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.14F));
        System.out.println(Math.round(12.56F));
        System.out.println("--------");

//        Max  返回两个值中的最大值
        System.out.println(Math.max(10,10.23));
        System.out.println("--------");

//        min 返回两个值中的最小值
        System.out.println(Math.min(10.1,10.23));
        System.out.println("--------");
//  返回a 的 b 次幂 的值
        System.out.println(Math.pow(2,3));
        System.out.println("--------");

//        产生随机数, 只能是0.0 至 1.0 之间的，不包含1.0单包含0.0
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));

    }

}
