package Chapter10_Calender;

import java.util.*;

public class Ex10_2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};//요일은 1부터 시작해서 [0]비어둠

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(1995,5,25);//11.22일을 반환하려함 month는 0부터 시작하기 때문에 10으로 지정,Calender.NOVEMBER로 지정해도됨
        System.out.println("date1은"+toString(date1)+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
        System.out.println("오늘(date2)는 "+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다");

        long diffrence =  (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
        System.out.println("그 날 (date1)부터 지금(date2)까지 "+diffrence+"초가 지났습니다.");
        System.out.println("일로 계산하면 "+diffrence/(24*60*60)+"입니다.");

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+
                "월"+date.get(Calendar.DATE)+"일";

    }
}
