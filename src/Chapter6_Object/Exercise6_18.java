package Chapter6_Object;

public class Exercise6_18 {
    public static boolean isNumber(String str) {
        if (str == null || str.equals(""))
            return false;//매개 변수로 어떤 값이 넘어올지 모르기 때문에 유효성 체크를 반드시해야함

        for(int i =0; i< str.length();i++){
            char ch = str.charAt(i);//str 차례대로 읽어오기
           // System.out.println(ch);
            if (ch < '0' || ch > '9') {
               return false;
              //  System.out.println(ch);
            }
        }
            return true;
        }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

        str = "1234435o";
        System.out.println(str + "는 숫자입니까?"+isNumber(str));
    }
}
