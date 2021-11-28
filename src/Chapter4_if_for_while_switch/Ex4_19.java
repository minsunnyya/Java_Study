package Chapter4_if_for_while_switch;//이름 붙은 반복문

//public class Ex4_19 {//연습해봄
//    public static void main(String[] args) {
//        for (int i = 2; i < 3; i++) {
//            for (int j = 1; j <= 4; j++)
//                System.out.println(i + " * " + j + " = " + i * j);
//        }
//        //  System.out.println();
//
//    }
//}

public class Ex4_19 {
    public static void main(String[] args) {
        Loop1:for(int i = 2; i<=9; i++){
        for(int j=1; j<=9; j++){
            if(j==5)
                break Loop1;
            System.out.println(i+"*"+j+"="+i*j);
        }
        }
    }
}



