package Chapter4_if_for_while_switch;

public class Ex4_13 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum<=100){
            System.out.printf("%d - %d%n", i, sum);
            sum+=++i;//이해안감 질문하기 0에다가 1을 더하고 시작하겠다는건가?
        }
    }
}
