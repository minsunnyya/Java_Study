package Chapter4_if_for_while_switch;//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수 출력

public class Exercise4_6 {
    public static void main(String[] args) {
        //1+5,2+4,3+3,4+2,5+1

        for (int i =  1; i<=6; i++)
            for(int j =1; j <=6; j++)
                if(i+j==6)
                    System.out.println(i+"와"+j+"의 합은"+(i+j)+"다");
                }
            }
//중괄호 주의해서 볼것. 코드 똑같이 짜도 값 달라짐 당연함

