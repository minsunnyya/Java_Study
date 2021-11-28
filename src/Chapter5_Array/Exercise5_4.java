package Chapter5_Array;

public class Exercise5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        //2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하시오
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];


            }
        }

        average =total/(float)(arr.length*5);//이부분 이해안감->됨 갯수표현 때문에 그리 표현함 arr[0].length


        System.out.println("total=" + total);
        System.out.println("average="+average);
    }
}



