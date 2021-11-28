package ExerciseSelf.Review6;

class Loading{
    int add(int a, int b){
        System.out.println("int a+ int b의 값은-");
        return a+b;
    }
    long add(int a, long b){
        System.out.println("int a + long b의 값은 -");
        return a+b;
    }
    long add(long a,int b){
        System.out.println("long a + long b의 값은 -");
        return a+b;
    }
    long add(long a, long b){
        System.out.println("long a + long b의 값은 -");
        return a+b;
    }
    int add(int[] a) {
        System.out.println("합은");
        int result = 0;
        for(int i =0; i<a.length;i++)
            result+= a[i];
        return result;
    }

}


public class Overloading {
    public static void main(String[] args) {
        Loading l = new Loading();
        System.out.println(l.add(20,20));
        System.out.println(l.add(20L,20));
        System.out.println(l.add(20,20L));
        System.out.println(l.add(20L,20L));

        int[] a = {100,200,300};
        System.out.println(l.add(a));
    }
}
