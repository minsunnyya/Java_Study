package ExerciseSelf.Review6;

public class Review6_2 {
    public static void main(String[] args) {
        Student0 s = new Student0("홍길동",1,1,100,60,76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student0 {
    String name;
    int ban;
    int num;
    int kor;
    int eng;
    int math;

    Student0(){};
    Student0(String name, int ban, int num, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


public String info(){
    return name+","+ban+","+num+","+kor+","+eng+","+math;
}
}