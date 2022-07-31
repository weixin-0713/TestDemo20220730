package 类作为形参和返回值20220702;

public class TestDemo {
    public static void main(String[] args){
//    创建一个操作类对象，并调用方法
        Cawopration  cp = new Cawopration();
        Caw  caw =new Caw();
        cp.useCaw(caw);

        Caw a = cp.getCaw();  // 返回一个对象并能进行赋值
        a.eat();


    }
}
