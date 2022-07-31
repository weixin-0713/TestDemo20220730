package equals方法演练;

public class Equals方法演练 {
    public static void main(String[] args){
//        创建实体类
        Student s1 =new Student();
        s1.setName("林青霞");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);

//       比较两个内容是否相同
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));  //有重写方法

    }
}
