package Chapter5_Array;

import java.util.Scanner;

public class Exercise5_6 {
    public static void main(String[] args) {
//        String[] words = {"mouse", "keyboard", "monitor", "computer"};
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < words.length; i++) {
//            char[] question = words[i].toCharArray();
//            for (int j = 0; j < question.length; j++) {
//                int a = (int) (Math.random() * words.length);
//
//                char tmp = 0;
//
//                tmp = question[j];
//                question[j] = question[a];
//                question[a] = tmp;
//            }
//                System.out.printf("Q%d.%s의 정답을 입력하세요>", i + 1, new String(question));
//
//                String answer = scanner.nextLine();
//
//                if (words[i].equals(answer.trim()))
//                    System.out.printf("맞았습니다.%n%n");
//                else
//                    System.out.printf("틀렸습니다.");
//
////단어의 글자 위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
//            }
//        System.out.println();
//        }
//    }
//
       int[] words = {1,2,3,4,5,6,7,8,9,10};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
                int a = (int) (Math.random() * words.length);
//
//                char tmp = 0;
//
//                tmp = question[j];
//                question[j] = question[a];
//                question[a] = tmp;
                System.out.println(a);

            }
            System.out.println();
        }


    }


