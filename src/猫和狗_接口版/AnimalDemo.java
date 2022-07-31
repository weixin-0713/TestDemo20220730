package 猫和狗_接口版;

//测试类

public class AnimalDemo {
    public static void main(String[] args){
        Jumpping c = new Cat();
        c.jump();
        System.out.println("----------");

//        重新抽象类
        Animal dog = new Dog();
        dog.setName("加菲狗");
        dog.setAge(5);

        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();

        System.out.println("----------");
//        用具体类去进行实现  （实际是用此种方法）
        Cat cat = new Cat("加菲猫",10);
        System.out.println(cat.getName()+","+cat.getAge());
        cat.eat();
        cat.jump();

    }
}
