package ExerciseSelf;

public class Bucket {
    public static void main(String[] args) {
        int Apple = 123;
        int Bucket = 10;
        int BucketSize = Apple/Bucket+(Apple%Bucket>0 ? 1:0);
        System.out.println(BucketSize);
    }
}
