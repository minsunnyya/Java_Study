package ExerciseSelf;

import java.util.Arrays;

public class Lotto {
    //총 45개의 숫자가 있는데 거기서 6자리만 꺼냄

    public static void main(String[] args) {
        //45개의 숫자 선언하기
        int[] lotto = new int[6];
        int j = 0;
        //for (int j = 1; j < lotto.length; j++) {
            lotto[j] = (int) (Math.random() * 45 + 1);
            //j임의의 숫자로 반복돼서 나오게하기

            System.out.print(Arrays.toString(lotto));
        }
    }








