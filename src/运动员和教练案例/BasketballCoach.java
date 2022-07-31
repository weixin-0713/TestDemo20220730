package 运动员和教练案例;

public class BasketballCoach extends Coach {
    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉！");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教授篮球！");
    }

    //    构造方法
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
}
