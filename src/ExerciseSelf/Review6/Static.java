package ExerciseSelf.Review6;

class MyMath01{
    //인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수()<<안에 들어가는 값이 필요없다
    long a,b;//인스턴스 변수 선언

    long add(){return a+b;}//void 없으므로 return으로 반환
    long sub(){return a-b;}
    long mul(){return a*b;}
    double div(){return a/b;}

    //인스턴스 변수와 관계없이 매개변수 만으로 작업이 가능 -static
    static long add(long a,long b){return a+b;}
    static long sub(long a, long b){return a-b;}
    static long mul(long a, long b){return a*b;}
    static double div(long a ,long b){return a / (double)b;}

}

public class Static {
    public static void main(String[] args) {
        System.out.println(MyMath01.add(200L,300L));
        System.out.println(MyMath01.sub(600L,300L));
        System.out.println(MyMath01.mul(10,40));
       // System.out.println(MyMath01.div(200L/100L));

        MyMath01 m = new MyMath01();//인스턴스메서드 부를때는인스턴스 객체 생성해야함
        m.a = 100;
        m.b = 10;
        System.out.println(m.add());
        System.out.println(m.sub());
        System.out.println(m.mul());
        System.out.println(m.div()

        );
    }
}
