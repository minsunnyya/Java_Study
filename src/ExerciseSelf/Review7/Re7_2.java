package ExerciseSelf.Review7;


class Parent{
    int x = 10;
}

class Child extends Parent{
    int x = 20;
    void method() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class Re7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }


}
