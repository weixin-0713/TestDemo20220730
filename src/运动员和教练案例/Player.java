package 运动员和教练案例;

public abstract class Player extends Person{
//    定义学习的方法
    public abstract void Study();

//     构造方法
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
}
