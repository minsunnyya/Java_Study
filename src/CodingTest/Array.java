package CodingTest;

import java.util.Arrays;
import java.util.*;
import java.util.Collections;

class ArrayCoding {
    public Integer[] solution(long n) {

        Integer[] answer = {};//Integer로 바꿔줌
        //1.long을 String으로 바꾸기
        String str = new Long(n).toString();
        //2.String을 list로 바꾸기
        //List<String> list = Arrays.asList(str);
       // StringBuffer sb = new StringBuffer(str);
        String[] result =str.split("");
        //System.out.println(str.get(0));
        //Arrays.sort(result,Collections.reverseOrder());
        for(int i = str.length()-1; i>=0; i--)
            System.out.print(i);

        //역순으로 출력하기
        //Arrays.sort(result,Collections.reverseOrder());
        //System.out.println(n);
        //for (int i = 0; i > 0; i++) {
        //  System.out.println(answer);i


        //3.list를 역순으로 출력
        //Collections.reverse(list);
        //4.역순으로 출력한 list를 반환
        // System.out.print(list);
        //str 역순으로 바꾸기
        return answer;
    }

    public static void main(String[] args) {
        //객체 생성
        ArrayCoding array = new ArrayCoding();
        //array 배열 메서드 호출

        //값 출력
        System.out.println(array.solution(123456));

        //문제점- 잘라서 안들어감 ->통째로 들어감
    }
}

//어떤 문제인지 파악
//고치는 방법을 알아야함
//파라미터



//String toString();
//for(int i =100; i>n; i--)




//String toString();
//for(int i =100; i>n; i--)

