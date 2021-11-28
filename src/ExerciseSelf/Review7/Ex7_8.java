package ExerciseSelf.Review7;

class Product{
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product{
    Tv1(){
        super(100);//조상클래스의 생성자 int price를 호출 , tv의 가격을 100만원으로
    }
    public String toString() {return "Tv";}
}

class Computer extends Product{
    Computer(){
        super(200); //컴퓨터의 가격을 200으로한다.
    }
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 100;
    int bonusPoint = 0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money-=p.price;
        bonusPoint+=p.bonusPoint;
        System.out.println(p+"을/를 구입하셨습니다");
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

    }
}
