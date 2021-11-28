package Chapter5_Array;

public class Exercise5_3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        //배열에 담긴 모든값 더하는 프로그램 작성
        for (int i=0 ; i < arr.length; i ++)
            sum += arr[i];


        System.out.println("sum=" + sum);
    }
}
