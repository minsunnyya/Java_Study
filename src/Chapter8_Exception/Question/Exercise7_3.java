package Chapter8_Exception.Question;
//컴파일 에러 난 곳 찾기
class Product{
    int price;
    int bonusPoint;

    Product(){}//조상생성자를 만들어줬더니 문제 없음

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product{
    Tv(){}//왜 여기서 컴파일 에러가 났을까? 조상 생성자가 없기때문

    public String toString(){
        return "Tv";
    }
}

public class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
