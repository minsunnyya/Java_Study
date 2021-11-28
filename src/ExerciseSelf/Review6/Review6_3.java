package ExerciseSelf.Review6;

public class Review6_3 {
    public static void main(String[] args) {
        Student01 s = new Student01("김민선",109,1804,"효성해링턴");

        System.out.println(s.name);
        System.out.println(s.getTotal());//메서드 불러온거라서()
        System.out.println(s.getAverage());//메서드 불러온거라서 ()
    }
}

class Student01{
    String name;
    int num;
    int live;
    String home;

    Student01(){};
    Student01(String name, int num, int live, String home){
        this.name = name;
        this.num = num;
        this.live = live;
        this.home = home;
    }

    int getTotal(){//반환 타입이 int
        return(num+live);
    }

    float getAverage(){
        return(int)(num+live)/2;
    }
}
