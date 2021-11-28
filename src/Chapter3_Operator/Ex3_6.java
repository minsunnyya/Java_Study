package Chapter3_Operator;

public class Ex3_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n" , a , b, a+b);
        System.out.printf("%d - %d = %d%n" , a , b, a-b);
        System.out.printf("%d * %d = %d%n" , a , b, a*b);
        System.out.printf("%d / %d = %d%n" , a , b, a/b);

        //int니까 정수값만 반환

    }
}

//printf와 println의 차이점
//printf = %d,%f등을 써야함
//println = 직관적사용