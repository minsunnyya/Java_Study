package ExerciseSelf;

public class Fahrenheit {
    public static void main(String[] args) {
        //화씨를 섭씨로 변환하는 코드는 c=5/9 * (F-32)
        //변환결과값은 소수점 셋째자리에서 반올림
        int f = 100;
        float c = Math.round((5/9f * (f - 32))*100)/100.0f;//나눗셈 값 나와야하기때문에 f로 표시


        System.out.println("화씨 ="+ f);
        System.out.println("섭씨 ="+ c);
    }
}
