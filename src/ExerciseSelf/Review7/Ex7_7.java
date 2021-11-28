package ExerciseSelf.Review7;

//운전하는 기능, 멈추는 기능 만드는 클래스

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("운전하는중중");    }

    void stop(){
        System.out.println("멈춥니다.");
    }
}

//물 뿌리는 기능 만드는 클래스
class Car2 extends Car{
    void water(){
        System.out.println("물을 뿌립니다.");
    }

}

public class Ex7_7 {
    public static void main(String[] args) {
        Car c = null;
        Car2 c2 = new Car2();
        Car2 c3 = null;

        c2.water();
        c = c2;//자손 타입을 조상타입에 형변환 가능
        c3 = (Car2)c;
        c3.water();




    }
}
