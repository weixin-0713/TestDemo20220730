package Integer类演练;

public class IntegerDemo {
    public static void main(String[] args){
        Integer s1 = new Integer("100");
        System.out.println(s1);

        Integer s2 =new Integer(200);
        System.out.println(s2);

        System.out.println("----------");
        Integer s3 = Integer.valueOf("100");
        System.out.println(s3);

        Integer s4 = Integer.valueOf(100);
        System.out.println(s4);

//       将string -->integer --> int  将String  转化未 int 类型
        String  str1 = "100";
//      方法1
        Integer  str2 = Integer.valueOf(str1);
        int  num3 =str2.intValue();
        System.out.println(num3);
//        方法2  将String  转化未 int 类型
        int  num4 =Integer.parseInt(str1);
        System.out.println(num4);


    }
}
