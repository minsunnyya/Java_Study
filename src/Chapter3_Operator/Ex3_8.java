package Chapter3_Operator;

public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);
        System.out.println(c);


        //원래 10 * 30 = 300이지만 큰 자료형에서 작은 자료형으로
        //변환 하면 데이터의 손실이 발생하므로 값이 바뀔 수 있다.
        //byte는 8비트
        //**값이 손실됨 주의해야함
    }
}
