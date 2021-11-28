package Chapter9_Java.lang;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다");
        else
            System.out.println("v1과 v2는 다릅니다");
    }
}

class Value {
    int value;

    Value(int value){
        this.value = value;
    }
}

//주소 값이 다르기 때문에 멤버 변수의 값이 10으로 같아도 false로 나옴
