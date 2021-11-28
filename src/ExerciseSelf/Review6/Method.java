package ExerciseSelf.Review6;//메서드의 실행 흐름 만들어보기

class Method2 {//메서드의 반환타입이 void가 아닌경우 반드시 return이 들어가야한다.
    long add ( long a, long b){
        long result = a+b;
        return result;
    }

    long sub ( long a, long b){
        return a-b;//{}안의 내용은 구현부
    }

    long multi (long a, long b)/*반환값 long{}*/{
        return a*b;
    }

    long div (long a , long b){
        return a/b;
    }

}

public class Method {
    public static void main(String[] args) {
        //Method2의 객체 생성
        Method2 m = new Method2();


        System.out.println(m.add(10,10)+m.sub(10,10)+m.multi(10,10));
    }
}
