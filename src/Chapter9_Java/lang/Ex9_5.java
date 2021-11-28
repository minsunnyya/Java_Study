package Chapter9_Java.lang;

class Card002 {
    String kind;
    int number;

    Card002() {
        this("SPADE", 1);
    }

    Card002(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ",number :" + number;
    }
}

public class Ex9_5 {
    public static void main(String[] args) {
        Card002 c1 = new Card002();
        Card002 c2 = new Card002("HEART",10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
