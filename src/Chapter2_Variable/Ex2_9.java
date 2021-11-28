package Chapter2_Variable;

public class Ex2_9 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23454365;
        System.out.printf("f1=%f, %e, %g%n", f1, f1,f1); //%e는 지수형태로 출력, %f는 소수점 아래 6자리만 g는 값을 간략하게 표시
        System.out.printf("f2=%f, %e, %g%n", f2, f2,f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3,f3);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n",d);
        System.out.printf("[213545363]%n");//souf 자동완성
        System.out.printf("[%s]%n",url);
        System.out.printf("[%20s]%n",url);
        System.out.printf("[%-20s]%n",url);
        System.out.printf("[.8s]%n",url);


    }
}
