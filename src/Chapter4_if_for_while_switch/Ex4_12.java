package Chapter4_if_for_while_switch;//while문 예제

//public class Ex4_12 {
//    public static void main(String[] args) {
//        for(int i =4; i>=0; i--){
//            System.out.println(i+"- I can do it.");
//        }
//    }
//}

public class Ex4_12 {
    public static void main(String[] args) {
        int i = 5;

        while(i--!=0){//i가 0이 아닐때 까지 1씩 감소하며 반복
            //i--;
            System.out.println(i+"- I can do it.");

        }
    }
}