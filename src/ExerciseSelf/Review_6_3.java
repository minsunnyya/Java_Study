package ExerciseSelf;

public class Review_6_3 {
    //두 개의 메서드 getTotal()과 getAverage()
    public static void main(String[] args) {

        Student2 s = new Student2();
        s.name = "김민선";
        s.ban = 3;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println(s.name);
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());
    }


}
class Student2 {//클래스 정의
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(){}//기본생성자

    Student2(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return (int)getTotal()/3f;
    }
       }