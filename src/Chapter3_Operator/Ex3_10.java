package Chapter3_Operator;

public class Ex3_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a);//오버플로우 돼서 이상하게 반환
        System.out.println("b="+b);
    }
}
