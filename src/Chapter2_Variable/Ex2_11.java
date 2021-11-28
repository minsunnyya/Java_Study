package Chapter2_Variable;

public class Ex2_11 {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;
        char cMin = 0,       cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax = " + (short)(sMax+1));
        System.out.println("cMin = " + (int)(cMin));
        System.out.println("cMin = " + (int)(--cMin));//왜 1로 빼면 안되지?
        System.out.println("cMax = " + (int)(cMax));
        System.out.println("cMax = " + (int)(++cMax));

    }
}
