package Object类和toString方法演练;
/* 看方法的快捷键是 CTRL +B
* 建议在子类中重写toString方法，可以使用快捷键方式新生成。  Alt+ insert
*
* */
public class ObjectDemo {
    public static void main(String[] args){
        Student st = new Student();
        st.setName("林青霞");
        st.setAge(30);
        System.out.println(st);
        System.out.println(st.toString()); // 实际上子类调用了父类的 toString方法

    }
}
