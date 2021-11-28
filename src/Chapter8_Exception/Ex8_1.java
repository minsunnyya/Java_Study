package Chapter8_Exception;

public class Ex8_1 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);

        } catch (Exception e) {//예외 처리 돼서 안나옴
            System.out.println(4);
        }
        System.out.println(5);
    }
}
