package ExerciseSelf.Review6;

public class MakeCardClass {
    public static void main(String[] args) {
        System.out.println("Card.width ="+ Card.width);
        System.out.println("Card.height ="+ Card.height);

        Card c1;
        c1 = new Card(); //=Card c1 = new Card()랑 같음
        //class Card의 속성 정의하기
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "space";
        c2.number = 4;

        System.out.println("c1의 kind는< "+c1.kind+" >이며"+"number는< "+c1.number+ ">이다. 크기는"+c1.width+"이다.");
        System.out.println("c2의 kind는< "+c2.kind+" >이며"+"number는< "+c2.number+ ">이다. 크기는"+c2.width+"이다.");
        System.out.println("c2의 width와 height값을 변경합니다.");

        c2.width =625;
        c2.height = 161;

        System.out.println("c2의 kind는< "+c2.kind+" >이며"+"number는< "+c2.number+ ">이다. 크기는"+c2.width+"이다.");




    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
