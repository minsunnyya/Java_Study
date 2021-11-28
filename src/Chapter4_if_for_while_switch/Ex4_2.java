package Chapter4_if_for_while_switch;

public class Ex4_2 {
    //자바에서 조건식의 결과는 True 아니면 False
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d일때, 참인것은 %n", x);

        if(x==0) System.out.println("x == 0");
        if(x!=0) System.out.println("x!=0");//거짓이라 출력안함
        if(!(x==0)) System.out.println("!(x==0)");//거짓이라 출력안함
        if(!(x!=0)) System.out.println("!(x!=0)");
        
        x = 1;
        System.out.printf("x가 %d 일 때, 참인 것은%n", x);
        if(x==0) System.out.println("x == 0");//거짓
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");//거짓



        }
    }

