package ExerciseSelf.Review6;
//생성자에소 다른 생성자 호출하기 - this()


class Coffee {
    String black;
    String white;
    int cup;

    Coffee() {
        this("americano", "milktea", 2);
    }

    Coffee(int cup) {
        this("americano", "milktea", cup);
    }

    Coffee(String black, String white, int cup) {
        this.black = black;
        this.white = white;
        this.cup = cup;
    }
}
public class This
{
    public static void main(String[] args) {
        Coffee c = new Coffee();
        Coffee c2 = new Coffee(4);


        System.out.println(c.black+","+c.white+","+c.cup);
        System.out.println(c2.black+","+c2.white+","+c2.cup);
    }


}
