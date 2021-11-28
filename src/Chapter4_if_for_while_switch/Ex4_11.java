package Chapter4_if_for_while_switch;//별찍기 도전->풀수있음

public class Ex4_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}