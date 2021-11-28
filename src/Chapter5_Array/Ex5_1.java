package Chapter5_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] iArray1 = new int[10];
        int[] iArray2 = new int[10];
        int[] iArray3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArray1.length; i++) {//1~10까지의 숫자를 순서대로 넣어줌
            iArray1[i] = i + 1;
        }

        for (int i = 0; i < iArray2.length; i++) {
            iArray2[i] = (int) (Math.random() * 10) + 1;//1~10임의의 수를 저장
        }
        for (int i = 0; i < iArray1.length; i++) {
            System.out.print(iArray1[i] + ",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArray2));
        System.out.println(Arrays.toString(iArray3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArray3);
        System.out.println(chArr);


    }
}

