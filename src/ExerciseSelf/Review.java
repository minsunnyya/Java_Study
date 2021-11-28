package ExerciseSelf;

public class Review {
    //다음과 같은 실행 결과를 얻도록 코드를 짜시오
    //홍길동 ,1,1,100,60,76,236,78.7
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student{//Student의 속성 (멤버변수)//인스턴스 변수
    String name;
    int ban;
    int grade;
    int math;
    int eng;
    int culture;


    Student() {};

    Student(String name, int ban, int grade, int math,int eng,int culture){//생성자의 매개변수로 선언된 변수의 이름,인스턴스변수와 이름이 같음

    this.name=name;
    this.ban=ban;
    this.grade=grade;
    this.math=math;
    this.eng=eng;
    this.culture=culture;
}
public String info(){
    return name+","+ban+","+grade+","+math+","+eng+","+culture+","+(math+eng+culture);
}
}

