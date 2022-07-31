package com.itheima接口演练;

public class ArryDemo {
    public static void main(String[] args) {
//        动态初始化
        int[] arry = new int[3];
//        静态初始化
        int[] arry2 = new int[]{0, 1, 2, 3};
//        或者时 arry2 = {0,1,2,3};

        for (int i = 0; i < arry2.length; i++) {
            System.out.println(arry2[i]);
        }


    }
}
