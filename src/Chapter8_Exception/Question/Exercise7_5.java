package Chapter8_Exception.Question;

class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;

    public void setVolume(int volume){//볼륨값 지정, 매개변수 있어서 유효값 테스트 해야함
        if(volume>MAX_VOLUME|| volume<MIN_VOLUME)
            return;
        this.volume = volume;
    }

    public int getVolume(){//값 리턴
        return volume;
    }

    public void setChannel(int channel){//채널값 지정 , 매개변수 있어서 꼭 유효값 테스트 해야함
        if(channel>MAX_CHANNEL||channel<MIN_CHANNEL)
            return;
        prevChannel=this.channel;
        this.channel = channel;

    }
    public int getChannel(){//값지정
        return channel;
    }
    public void gotoPrevChannel(){
        setChannel(prevChannel);

//    public void gotoPrevChannel(){
//        --channel;
    }


}



public class Exercise7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setChannel(20);
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());


    }
}
