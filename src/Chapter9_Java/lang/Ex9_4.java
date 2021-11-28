package Chapter9_Java.lang;

class Card00{
    String kind;
    int number;

    Card00(){
        this("SPADE",1);
    }

    Card00(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}


public class Ex9_4 {
    public static void main(String[] args) {
        Card00 c1 = new Card00();
        Card00 c2 = new Card00();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

/*오브젝트 클래스로부터 상속받은 toString()을
* 오버라이딩 하지 않았기 때문에 object 호출됨*/
