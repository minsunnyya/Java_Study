package Chapter3_Operator;

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortpi =Math.round(pi * 1000)/1000.0;
        //double shortpi =Math.round(pi * 1000)/1000으로 나눴으면 값이
        //3이됨 int/int의 결과는 int이기때문
        System.out.println(shortpi);
    }
}
