package 猫和狗_接口版;

public abstract  class Animal {
    private String name;
    private int age;

//  快捷键 alt+inset 生成构造方法
    public Animal() {
    }

//    生成带参构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

//  生成一个吃饭的抽象方法
    public abstract void  eat();

}
