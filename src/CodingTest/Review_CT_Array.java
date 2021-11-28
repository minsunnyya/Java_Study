package CodingTest;

import java.util.Arrays;

class Review_CT_Array {
    public int[] solution(long n) {
        int answer[] = {};
        String a = Long.toString(n);//12345
        //= String a = ""+n;
        String []b = a.split("");//쪼갬
       // String c = b.toString();//for문 하기 위해 string으로 변환

        for(int i=a.length()-1; i>=0; i--){
           // System.out.println(answer);
            System.out.println(b);
           // System.out.println(b);
           // System.out.println(c);


        }
        return answer;
    }

    public static void main(String[] args) {
        Review_CT_Array arr = new Review_CT_Array();
        System.out.println(arr.solution(12345));
    }
}
