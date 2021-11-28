package CodingTest;
import java.util.*;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

class Hw_Arr_While {

    public int[] solution(long n) {
        //n을 나누기 가능한 int형으로 변환
        int[] answer = new int[String.valueOf(n).length()];//객체 생성
        //만약 12345라면 10으로 나눈 나머지값 반환(while)
        int temp = 0;
        int index = 0;
        while (n > 0) {
            temp = (int) n % 10;//123일때 temp값 3,2,1(나머지)
            n = n / 10;//n을 다시 10으로 나눠줌
            /*  123/10=120..3
                12/10=1..2
                1/10=0..1

             */

            answer[index] = temp;
            index++;
            System.out.print(temp);

        }

        return answer;
    }


    public static void main(String[] args) {
        Hw_Arr_While arr = new Hw_Arr_While();
        System.out.println(arr.solution(12345));

    }
}
