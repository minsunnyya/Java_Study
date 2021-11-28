package Chapter8_Exception.Question;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;

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
        this.channel = channel;
        }
    public int getChannel(){//값지정
        return channel;
}


    }


public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setVolume(20);
        System.out.println(t.getVolume());
    }
}
