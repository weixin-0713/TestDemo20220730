package 运动员和教练案例;

public class PingpangPlayer extends Player implements SpeakEnglish {
//    构造方法

    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }


//    重写方法


    @Override
    public void eat() {
        System.out.println("兵乓球运动员吃羊肉！");
    }

    @Override
    public void Study() {
        System.out.println("兵乓球运动员学习打兵乓球！");
    }

    @Override
    public void saylanguage() {
        System.out.println("学英语！");
    }
}
