package Chapter6_Object;

class Car2{
    String color;
    String geartype;
    int door;

    Car2() {//Car클래스의 기본생성자
        this("white", "auto", 4);
    }

    Car2(String color) {//매개변수가 있는 생성자
        this(color, "auto", 4);
    }

    Car2(String color, String geartype, int door){//매개변수가 있는 생성자
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
}


public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color="+c1.color+",c1의 geartype="+c1.geartype+",c1의 door="+c1.door);
        System.out.println("c2의 color="+c2.color+",c2의 geartype="+c2.geartype+",c2의 door="+c2.door);
    }
}
