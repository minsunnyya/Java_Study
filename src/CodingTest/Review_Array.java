package CodingTest;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
import java.util.*;
import java.util.Arrays;
import java.util.List;

class Review_Array {

    public int[] solution(long n) {
        int[] answer = {};
//        String[] a = new String[answer.length];
//        String x =String.valueOf(a);
//        String[] y = x.split(x);//split쓸때 []선언 해야함
//        String b = String.valueOf(y);
//반환 값으로 해줘야함
        String n1 = new Long(n).toString();

        int [] arr= new int[5];

        int index = 0;
        for (int i = n1.length() - 1; i >= 0; i--) {
//            arr[index++] = n1.charAt(i);
            System.out.print(n1.charAt(i));
        }
        System.out.println();



//        String n3 = String.valueOf(n2);
//        for(int i= n3.length()-1; i>=0; i--)
//        System.out.print(i);



        return answer;
    }


    public static void main(String[] args) {
        Review_Array arr = new Review_Array();
        System.out.println(arr.solution(12345));

    }
}
