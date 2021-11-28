package Chapter4_if_for_while_switch;//switch문의 제약조건

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울입니다.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;
        }
    }
}

//실수한 부분 : switch를 여러번 넣으려 했음 case 수행 후 break로 닫아줌

