package Chapter3_Operator;

public class Exercise3_4 {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket>=0? 1:0);
        System.out.println(numOfBucket);

        //나머지 3개를 담을 바구니 하나가 더 필요함 문제를 제대로 읽기.
        //3개가 필요한게 아님
    }
}
