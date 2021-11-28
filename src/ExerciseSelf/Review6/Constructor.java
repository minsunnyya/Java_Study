package ExerciseSelf.Review6;

class Computer {
    String desktop;
    int keyboard;
    String mouse;

    Computer(){}//기본 생성자

    Computer(String d, int k, String m){//매개변수가 있는 생성자
        desktop = d;
        keyboard = k;
        mouse = m;
    }
}

public class Constructor {
    //모든 클래스에는 반드시 하나 이상의 생성자가 정의 되어 있어야한다.
    //생성자 예제 직접 만들어보기
    public static void main(String[] args) {

        Computer c = new Computer();
        c.desktop = "samsung";
        c.keyboard = 10;
        c.mouse = "apple";

        System.out.println(c.desktop+","+c.keyboard+","+c.mouse);

        Computer c2 = new Computer("Lg",652,"kt");
        System.out.println(c2.desktop+","+c2.keyboard+","+c2.mouse);


    }



}
