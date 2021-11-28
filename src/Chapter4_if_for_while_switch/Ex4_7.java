package Chapter4_if_for_while_switch;

public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0;

        for(int i = 1; i<=5; i++){
            num = (int)(Math.random()*6+1);
            System.out.println(num);
        }
    }
}
//num = (int)(Math.random()*6+1) 해설하자면
//1과 6사이의 임의의 난수를 얻어 출력할 예정
//원래는 0.0<=Math.random()<1.0으로 되어있음
//양변에 int형으로 바꿔주고 6을 곱해줌
//0<=Math.random()*6<6
//1과 6사이니까 1은 포함되고 6은 포함되지 않음
//그래서 양변에 1씩 더해줌
//1<=Math.random()*6<7완성.