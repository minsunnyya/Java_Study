package Chapter9_Java.lang;

public class Exercise9_1 {
    public static void main(String[] args) {
        SutdaCard01 c1 = new SutdaCard01(3,true);
        SutdaCard01 c2 = new SutdaCard01(3,true);

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c1.equals(c2):"+c1.equals(c2));
    }
}

class SutdaCard01 {
    int num;
    boolean isKwang;

    SutdaCard01() {
        this(1, true);
    }

    SutdaCard01(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;

    }


    public String toString() {
        return num + (isKwang ? "k" : "");
    }
}
