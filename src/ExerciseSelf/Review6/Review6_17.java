package ExerciseSelf.Review6;

public class Review6_17 {

    public static void main(String[] args) {
        int []original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int [] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
   public static int[] shuffle(int[] arr){
        if(arr==null||arr.length==0)
            return arr;

        for(int i = 0; i<arr.length;i++){
            int j = (int)(Math.random()*arr.length);//1~9까지의 숫자 곱해줌

            System.out.print(i);

            System.out.print(j);

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }
        return arr;
    }
}
