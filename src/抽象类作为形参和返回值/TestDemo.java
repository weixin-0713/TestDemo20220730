package 抽象类作为形参和返回值;

public class TestDemo {
    public static void main(String[] args){
// 创建一个操作类,并调用
    AnimalOpration aa = new AnimalOpration();

//    创建一个实体类
    Animal an = new Dog();
    aa.useAnimal(an);

//    返回一个对象
        Animal ab = aa.getAnimal();
        ab.eat();

    }
}
