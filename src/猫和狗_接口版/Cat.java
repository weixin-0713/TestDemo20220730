package 猫和狗_接口版;

public class Cat extends Animal implements Jumpping{

//    重写eat 抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    };

    //    重写 jump 抽象方法
    @Override
    public void jump() {
        System.out.println("猫跳高！");
    }

    // 构造方法
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
