package ExerciseSelf.Review7;
//상속 클래스 만들어보기

class Tv001{
    int channel;
    boolean power;


    void power(){ power= !power ;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class SmartTv extends Tv001{
    boolean caption;

    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}



public class Re7_1 {
    public static void main(String[] args) {
        SmartTv s = new SmartTv();
        s.channel = 100;
        s.channelUp();
        System.out.println(s.channel);
        s.displayCaption("복습중");
        s.caption=true;
        s.displayCaption("hello,its me");
    }

}
