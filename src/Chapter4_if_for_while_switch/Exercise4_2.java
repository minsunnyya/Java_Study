package Chapter4_if_for_while_switch;

public class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <= 20; x++) {
            if (x % 2 != 0 && x % 3 != 0)//||라고 생각했는데 &&이었음 둘다 만족해야하기때문. 문제를 제대로 읽자!
                sum += x;


            System.out.println(sum);

        }
    }
}


//자동정렬 c+alt+i