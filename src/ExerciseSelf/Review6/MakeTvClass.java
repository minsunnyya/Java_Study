package ExerciseSelf.Review6;//예제 6-1 혼자 구현

//class선언-설계도
class Tv{
    boolean isPower;
    int channel;
    String color;

    //기능선언
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}

public class MakeTvClass {
    public static void main(String[] args) {
        //인스턴스 생성
        Tv t;//Tv인스턴스를 참조하기 위한 참조변수 t선언
        t = new Tv();//객체 생성후 객체의 주소를 참조 변수 t에 저장
        t.channel = 7;
        t.channelUp();//참조변수 t.channelUp으로 불러내야함
        t.channelDown();
        System.out.println("현재 채널은 "+ t.channel + "입니다.");

    }
}

