package Chapter8_Exception;

public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0/0);
            System.out.println(2);//예외가 발생해서 실행되지않음
        }catch (ArithmeticException ae){//해당 에러로 감
            System.out.println(3);
        }
        System.out.println(4);
    }
}
