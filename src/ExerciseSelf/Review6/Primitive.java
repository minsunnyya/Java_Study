package ExerciseSelf.Review6;

class Data2 {int x;}


public class Primitive
{
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x =10;
        System.out.println(d.x);

        change(d.x);
        System.out.println(d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println(x);
    }
}
