package Chapter9_Java.lang;

public class Ex9_6 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2?" + (str1 == str2));
        System.out.println("str1.equals(str2)?"+ str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4?"+(str3==str4));//주소로 비교하기 때문에 false나옴==등가연산자 비교
        System.out.println("str3.equals(str4)?"+str3.equals(str4));
    }
}
