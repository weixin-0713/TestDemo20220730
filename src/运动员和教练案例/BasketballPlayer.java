package 运动员和教练案例;

public class BasketballPlayer extends Player{
//    构造函数

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    //    重写方法
    @Override
    public void Study() {
        System.out.println("篮球运动员学习汉语！");
    }

    @Override
    public void eat() {
        System.out.println("篮球远动员吃牛肉！");
    }
}
