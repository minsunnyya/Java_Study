package Chapter4_if_for_while_switch;//do-while문

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        int input =0, answer =0;

        answer = (int)(Math.random() * 100)+1;//1~100까지의 임시변수 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1과 100사이의 정수를 입력하세요>");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 시도해보세요.");
            }
            else if(input <answer){
                System.out.println("더 큰수로 시도해보세요");
            }
        }while (input!=answer);
        System.out.println("정답입니다.");
    }
}
