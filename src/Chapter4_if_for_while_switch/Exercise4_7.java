package Chapter4_if_for_while_switch;//12345 각 문자 더하기

public class Exercise4_7 {
    public static void main(String[] args) {
        //화면에 입력된 값 숫자 하나하나를 전체 다 더해라
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';//charAt메서드는 문자열에서 i번째 문자 반환함

        }
        System.out.println(sum);
    }
}

