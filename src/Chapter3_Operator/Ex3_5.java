package Chapter3_Operator;

public class Ex3_5 {
    public static void main(String[] args) {
        double d =85.4; //d가 형변환 되도 값에는 변함없음.
        int score = (int) d;
        System.out.println("score ="+score);
        System.out.println("d="+d);
    }
}
