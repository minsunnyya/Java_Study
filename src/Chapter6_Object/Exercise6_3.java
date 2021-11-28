package Chapter6_Object;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "김민선";
        s.ban = "디지털 컨버전스";
        s.height = 161;
        s.phone = 64714871;

        System.out.println("이름 : "+s.name);
        System.out.println("키랑 번호 더함 : "+s.getTotal());
        System.out.println("키랑 번호 나눔 : "+s.getAverage());

    }
}

class Student1 {
    String name;
    String ban;
    int height;
    int phone;

    Student1() {}//기본 생성자, 클래스 이름 하고 같음 매개변수 없는 생성자.

    Student1(String name, String ban, int height, int phone){
        this.name = name;
        this.ban = ban;
        this.height = height;
        this.phone = phone;
    }

    int getTotal(){
        return height+phone;
    }

    float getAverage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }
    public String info() {
        return name
                +","+ban
                +","+height
                +","+phone
                +","+getTotal()
                +","+getAverage()
                ;
    }

}

