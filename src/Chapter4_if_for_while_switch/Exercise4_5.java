package Chapter4_if_for_while_switch;

//public class Exercise4_5 {
//    public static void main(String[] args) {
//        for (int i=0; i<=10; i++){
//            for(int j =0; j<=i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}

public class Exercise4_5 {//while문
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
        }
    }
    }