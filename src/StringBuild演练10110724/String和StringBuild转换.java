package StringBuild演练10110724;

/**
 * 1. 将 StringBuilder 转换成String 类型  （通过tostring() 方法）
 * 2. 将 String 类型 转换为 StringBuilder （通过构造函数）
 * */

public class String和StringBuild转换 {
    public static void main(String[] args) {
//  方法：     将 StringBuilder 转换成String 类型
        StringBuilder  sb = new StringBuilder();
        sb.append("Hello");
//        直接通过赋值方式操作
//        String s = sb; ---这是错误的方法
        sb.toString();
        System.out.println("StringBuilder 转换成String 类型："+sb);

//        方法：String 类型 转换为 StringBuilder
        String  s= "helloe";
        StringBuilder  sb2 = new StringBuilder(s);
        System.out.println("将 String 类型 转换为 StringBuilder:"+sb2);
    }


}
