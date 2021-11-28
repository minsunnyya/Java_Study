package Chapter7_Extends;

class Outer001{
    class Inner1{
        int iv = 100;
    }
}

public class Exercise7_6 {
    public static void main(String[] args) {
        Outer001 o = new Outer001();//외부클래스 인스턴스 생성
        Outer001.Inner1 i = o.new Inner1();//외부 클래스 안의 내부클래스 인스턴스 생성
        System.out.println(i.iv);
    }
}
