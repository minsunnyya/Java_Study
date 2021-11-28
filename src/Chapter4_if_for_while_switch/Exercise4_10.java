package Chapter4_if_for_while_switch;

import java.util.Scanner;

public class Exercise4_10 {
    public static void main(String[] args) {
        int answer = (int) Math.random() * 100 + 1;
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요:");
            input = scanner.nextInt();

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("정답입니다.");
                System.out.println(count + "번만에 정답을 맞췄습니다!!!");
                break;
            }

        } while (true);//무한 반복문
    }
}