package Integer类演练;
/*
 * 有一个字符串 ”91 27 46 38 50“  转化成 ”27 38 46 50 91“
 * */


import java.util.Arrays;

public class Integer练习题 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

//      定义一个字符串数组
        String[] str1 = s.split(" ");

//        for (int i = 0; i < str1.length; i++) {
//            System.out.println(str1[i]);
//
//        }
//        定义一个int 数组
        int[] arr = new int[str1.length];

        for (int i= 0 ; i<str1.length; i++){
            arr[i] =Integer.parseInt(str1[i]);
        }

//        对数组进行排序
        Arrays.sort(arr);
        for (int i= 0 ; i<str1.length; i++){
            System.out.println(arr[i]);
        };

//        创建一个StringBuldier 进行拼接
        StringBuilder sb = new StringBuilder();
        for (int i= 0 ; i < str1.length; i++){
            //      对字符串进行拼接
            if (i == str1.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(str1[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);


    }
}
