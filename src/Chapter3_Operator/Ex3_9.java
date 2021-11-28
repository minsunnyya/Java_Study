package Chapter3_Operator;

public class Ex3_9 {
    public static void main(String[] args) {


        int a = 1_000_000; //1백만
        int b = 2_000_000; //2백만
//
//        long c = a * b; // a*b = 2,000,000,000,000?????
        long c = (long)a*b;
        //타입 바꿔서 진행해야 값 제대로 나옴



        System.out.println(c);
    }
}
