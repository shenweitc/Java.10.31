package Data_31;

import java.util.Date;
import java.util.Random;

/*
1:打印时间原点开始一年之后的时间.
2:定义任意两个Date对象，比较一 下哪个时间在前，哪个时间在后
 */
public class Demo01 {
    public static void main(String[] args) {
        //打印时间原点开始一年之后的时间.
//        extracted();
        //定义任意两个Date对象，比较一 下哪个时间在前，哪个时间在后
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if (time1 > time2) {
            System.out.println("第一个时间在前，第二个时间在后");
        } else if (time1 < time2) {
            System.out.println("第二个时间在前，第一个时间在后");
        } else {
            System.out.println("时间一样");
        }
    }

    private static void extracted() {
        Date d1 = new Date(0L);
        long time = d1.getTime();
        //加一年
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);
    }
}
