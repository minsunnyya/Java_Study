package Chapter4_if_for_while_switch;

public class Exercise4_8 {
    public static void main(String[] args) {
        int value = (int)Math.random()*6+1;
        //0.0<=Math.random<1.0
        //(int)0<Math.random<1
        //(int)0<Math.random*6<6
        //(int)0<Math.random*6+1<7
        System.out.println(value);
    }
}
