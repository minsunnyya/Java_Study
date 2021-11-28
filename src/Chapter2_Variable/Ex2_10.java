package Chapter2_Variable;

import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 자리 정수 중 하나를 입력해 보세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); //대소문자 주의하기, 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n", num);

        ;
    }
}
