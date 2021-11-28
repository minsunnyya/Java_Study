package Chapter4_if_for_while_switch;//break문과 continue문 예제

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("(1) 소고기");
            System.out.println("(2) 돼지고기");
            System.out.println("(3) 닭고기");
            System.out.println("원하는 메뉴 (1~3)을 선택하세요.(종료:0)>");

            String tmp = scanner.nextLine();//임시변수에 화면으로 입력한 값 저장
            menu = Integer.parseInt(tmp);//임시변수 menu에 재저장

            if(menu==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if(!(1<=menu && menu <=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다");
                continue;
            }
            System.out.println("선택하신 메뉴는"+menu+"번입니다.");
        }
    }
}
