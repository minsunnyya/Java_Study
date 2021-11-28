package Chapter2_Variable;

public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0) - '0'); //문자열을 문자로 반환
        System.out.println('3' - '0'+1);//문자를 숫자로 반환.
        System.out.println(Integer.parseInt("3")+1);
        System.out.println("3"+1);
        System.out.println((char)('3'+0));
    }
}
