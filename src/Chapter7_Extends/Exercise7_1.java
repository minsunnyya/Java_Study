package Chapter7_Extends;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//    SutdaDeck() {
//        //섯다카드 20장을 담는 값을 초기화
//       for(int i = 0; i<cards.length;i++){
//           int num =
       }
        //단, 섯다 카드는 1~10까지의 숫자가 적힌 카드가 한 쌍씩있고

        //숫자 1,3,8인 경우는 둘 중 한 장은 광이어야한다
        //즉 SutdaCard의 인스턴스 변수 isKwang의 값이 True여야한다


class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num =num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.println(deck.cards[i]+",");
    }
}
