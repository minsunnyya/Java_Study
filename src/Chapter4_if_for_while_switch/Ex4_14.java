package Chapter4_if_for_while_switch;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        int num = 0, sum =0;
        System.out.println("숫자를 입력하세요(예:12345)>");

        Scanner scanner = new Scanner(System.in);//화면에 입력
        String tmp = scanner.nextLine();//화면에 입력한거 임시변수에 저장
        num =Integer.parseInt(tmp);//임시변수 형변환해서 num에 재저장

        while(num!=0){
            sum += num%10;
            System.out.printf("sum=%d num=%d%n", sum,num);
            num/=10;
        }
        System.out.printf("각 자리수의 합 : "+sum);


    }
}
