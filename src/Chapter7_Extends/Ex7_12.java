package Chapter7_Extends;

public class Ex7_12 {
    class InstanceInner {
        int iv = 100;
        final static int CONST = 100; //final static은 상수 이므로 사용 가능
    }

    static class StaticInner {
        int iv = 200;
        static int cv =200; //static클래스만 staticㅁ[ㅁ버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        }
    }
    public static void main(String args[]) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
