package Chapter4_if_for_while_switch;//중첩 if문

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.printf("점수를 입력해주세요>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();//화면에 쓴 값 점수에 저장

        System.out.printf("당신의 점수는 %d입니다%n", score);//화면에 쓴 값 출력

        if (score >= 90) {
            grade = 'A';  //이중if문 ;로 구분하고 밑에 다시 if
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
            opt = '+';

        }
    }
          else {
        grade='C';
    }
            System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);

}
    }

    //괄호 여닫기 주의, 변수 선언 제대로 보기

