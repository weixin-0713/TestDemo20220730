package 运动员和教练案例;

public abstract class Person {
    private String name;
    private   int age;

//    吃饭方法
    public abstract  void eat();


//    构造方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
