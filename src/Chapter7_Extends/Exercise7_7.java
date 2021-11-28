package Chapter7_Extends;

class Outer03{
    static class Inner0{
        int iv = 200;
    }
}

public class Exercise7_7 {
    public static void main(String[] args) {
       //static이라 굳이 외부 클래스 인스턴스를 생성 안해도 됨.
        Outer03.Inner0 i = new Outer03.Inner0();
        System.out.println(i.iv);

    }
}
