//package Chapter8_Exception.Question;
//
//
//class SutdaDeck {
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];//객체 생성
//
//    SutdaDeck() {
////        int j = 0;
////        for(int i = 1; i<=10; i++){
////            if (j ==1||j==3||j==8)
////                System.out.println("광");}
//
//<<<<<<< HEAD
//        for(int i = 0; i<cards.length; i++) {
//            int num = i % 10 + 1;
//            boolean isKwang = (num == 1 || num == 2 || num == 8);
//
//=======
//        for (int i = 0; i < cards.length; i++) {
//            int num = i % 10 + 1;
//            boolean isKwang = (num == 1 || num == 3 || num == 8);
//>>>>>>> origin/master
//            cards[i] = new SutdaCard(num, isKwang);
//        }
//    }
//
//       void shuffle() {//반환 타입 없어서 void로 선언
//            for (int i = 0; i < cards.length; i++) {
//                int j = (int) (Math.random() * cards.length);
//                SutdaCard tmp = cards[i];
//                cards[i] = cards[j];
//                cards[j] = tmp;
//            }
//        }
//
//        SutdaCard pick(int index){
//           if(index< 0 || index >= CARD_NUM)//유효성검사
//               return null;
//           return cards[index];
//        }
//
//        SutdaCard pick(){
//           int index = (int)(Math.random()*cards.length);
//           return pick(index);
//        }
//
//
//        }
//
//
//
//    class SutdaCard {
//        int num;
//        boolean isKwang;
//
//        SutdaCard() {
//            this(1, true);
//        }
//
//        SutdaCard(int num, boolean isKwang) {
//            this.num = num;
//            this.isKwang = isKwang;
//        }
//
//        public String toString() {
//            return num + (isKwang ? "k" : "");
//        }
//    }
//
//    public class Exercise7_1 {
//        public static void main(String[] args) {
//            SutdaDeck deck = new SutdaDeck();
//
//            System.out.println(deck.pick(0));
//            System.out.println(deck.pick());
//            deck.shuffle();
//
//            for (int i = 0; i < deck.cards.length; i++)
//                System.out.print(deck.cards[i] + ",");
//
//            System.out.println();
//            System.out.println(deck.pick(0));
//        }
//    }


