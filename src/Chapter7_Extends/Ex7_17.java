package Chapter7_Extends;//

public class Ex7_17 {
    Object i = new Object(){ void method(){}};
    static Object cv = new Object(){ void method(){}};

    void myMethod() {
        Object lv = new Object(){ void method(){}};
    }
}
