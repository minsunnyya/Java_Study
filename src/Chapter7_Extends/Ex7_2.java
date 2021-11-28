package Chapter7_Extends;//참조 변수 super

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {int x = 10;}

class Child extends Parent {//조상클래스와 자식 클래스의 x이름이 같다 어떻게 구별할 것인가?
    int x = 20;

    void method() {
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}
