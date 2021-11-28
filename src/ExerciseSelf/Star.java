package ExerciseSelf;

//별찍기 만들어보기
public class Star {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print('*');
            }
            System.out.println();
        }
    }
}


