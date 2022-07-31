package 抽象类作为形参和返回值;

public  class AnimalOpration {
//    抽象类作为形参
    public void useAnimal(Animal an){
        an.eat();

    };
    public Animal getAnimal(){
        Animal an = new Dog();
        return an;
    }
}
