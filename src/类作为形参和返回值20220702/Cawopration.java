package 类作为形参和返回值20220702;

public class Cawopration {
//    类名作为形参
    public void useCaw(Caw c){
        c.eat();
    }

//    类名作为返回值
    public Caw  getCaw(){
        Caw c= new Caw();
        return c;
    }


}
