package Chapter4_if_for_while_switch;//이름 붙은 반복문 예제

import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer: //while문에 outer라는 이름 붙임
        while (true){
            System.out.println("(1) 와사비");
            System.out.println("(2) 간장");
            System.out.println("(3) 소금");
            System.out.print("원하는 메뉴 1~3중에 선택하세요. (종료 하고 싶으면:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (!(1<=menu && menu<=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }
            for(;;){
                System.out.println("계산할 값을 입력하세요(계산종료:0, 전체종료:99)>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if(num==0)
                    break;

                if(num==99)
                    break outer;

                switch (menu){
                    case 1:
                        System.out.println("result="+num*num);
                        break;

                    case 2:
                        System.out.println("result="+Math.sqrt(num));
                        break;

                    case 3:
                        System.out.println("result="+Math.log(num));
                        break;




                }


            }
        }
    }
}
