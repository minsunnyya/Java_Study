package ExerciseSelf.Review6;

class Data3{ int x ;}

public class Reference {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x=100;
        System.out.println(d.x);

        change(d);
        System.out.println(d);
        System.out.println(d.x);
    }

    static void change(Data3 d){
        d.x =1000;
        System.out.println(d.x);
    }

}
