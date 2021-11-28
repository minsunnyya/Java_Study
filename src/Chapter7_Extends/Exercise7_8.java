package Chapter7_Extends;

class Outer04{
    int value = 10;//같은 이름의 인스턴스 변수

    class Inner04{
        int value=20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer04.this.value);
        }
    }
}



public class Exercise7_8 {
    public static void main(String[] args) {
        Outer04 o = new Outer04();
        Outer04.Inner04 i = o.new Inner04();

        i.method1();
    }
}
