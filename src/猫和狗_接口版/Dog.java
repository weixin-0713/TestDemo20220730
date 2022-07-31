package 猫和狗_接口版;

public class Dog extends Animal implements Jumpping{
//  重写抽象类

    @Override
    public void eat() {
        System.out.println("狗吃骨头！");
    }

    @Override
    public void jump() {
        System.out.println("狗跳高！");
    }

//  创建构造方法

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
