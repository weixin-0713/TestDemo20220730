package 运动员和教练案例;

public abstract class Coach extends Person {
//    教的方法
    public abstract  void teach();


//    构造方法
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
