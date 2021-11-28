package Chapter5_Array;

import java.util.Arrays;

public class Exercise5_5 {
    public static void main(String[] args) {
        //1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자 프로그램 만들기

        //배열 선언
        int[] ball = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball2 = new int[3];


        //i는 1~9까지 반복되면서 나옴
        for (int i = 0; i < ball.length; i++) {
            int j = (int) (Math.random() * ball.length);//j는 랜덤으로 9개의 숫자가 나옴

            int tmp = 0;

            //ball[i]=임의의 3숫자의 값
            //ball2[j]={1,2,3,4,5,6,7,8,9}
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        System.arraycopy(ball,0,ball2,0,3);

        for(int i =0; i<ball2.length; i++){
           System.out.println(ball2[i]);
    }


}
}

