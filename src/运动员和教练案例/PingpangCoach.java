package 运动员和教练案例;

public class PingpangCoach extends Coach implements SpeakEnglish{
//    构造方法
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

//    重写抽象类

    @Override
    public void eat() {
        System.out.println("兵乓球教练吃牛肉！");
    }

    @Override
    public void teach() {
        System.out.println("兵乓球教练教授兵乓球！");
    }

    @Override
    public void saylanguage() {
        System.out.println("学习英语！");
    }
}
