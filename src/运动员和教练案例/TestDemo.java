package 运动员和教练案例;

//测试类
public class TestDemo {
    public static void main(String[] args ){

//    篮球教练
    BasketballCoach bscorch = new BasketballCoach("篮球教练",30);
        bscorch.eat();
        bscorch.teach();

        System.out.println("----------");
//    兵乓球教练
    PingpangCoach ppcorch = new PingpangCoach("兵乓教练",20);
        ppcorch.eat();
        ppcorch.teach();
        ppcorch.saylanguage();

        System.out.println("----------");

//    篮球运动员
    BasketballPlayer bsPalyer = new BasketballPlayer("篮球运动员",21);
        bsPalyer.eat();
        bsPalyer.Study();

        System.out.println("----------");
//    兵乓球运动员
    PingpangPlayer ppPalyer = new PingpangPlayer("兵乓运动员",22);
        ppPalyer.eat();
        ppPalyer.Study();
        ppPalyer.saylanguage();
    }
}
