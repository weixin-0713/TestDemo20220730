package Date类演练;

import java.util.Date;

public class DateDemo {
    public static void main(String[] arg){
        Date d1 = new Date();
        System.out.println(d1);


        long  t = 1000*60*60;
        Date d2 = new Date(t);
        System.out.println(d2);

    }
}
