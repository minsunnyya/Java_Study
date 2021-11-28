package ExerciseSelf;

class Tv{
    boolean ChannelOnOff;
    int channel;
    int volume;


    final int MIN_VOLUME = 1000;
    final int MAX_CHANNEL = 1500;


    void channelUp()

    {
        if (channel == MAX_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel++;
        }
    }

    void volumeDown()
        {
            if (volume < MIN_VOLUME) {
                volume = volume * 2;
            }
        }

}

public class LogicTv {
    public static void main(String[] args) {

        Tv t = new Tv();

        t.channel = 2000;
        t.volume = 100;
        System.out.println("채널은"+t.channel+"볼륨은"+t.volume);

        t.channelUp();
        t.volumeDown();

        System.out.println("채널은"+t.channel+"볼륨은"+t.volume);
        //채널, 볼륨값,메서드 이름붙여서 불러오기, 변수 바꿔서 메서드 다시부르기


    }
}
