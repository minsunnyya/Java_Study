package Chapter7_Extends;

public class Ex7_13 {
    class InstanceInner {}
    static class StaticInner {}

    //인스턴스멤버 간에는 서로 접근이 가능하다.
    InstanceInner iv = new InstanceInner();

    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        //static멤버는 인스턴스멤버에 직접 접근할 수 없다.
        StaticInner obj2 = new StaticInner();

        //굳이 접근하려면 아래와 같이 객체를 생성해야한다.

        Ex7_13 outer =new Ex7_13();
        //인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        //인스턴스 메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod() {
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
