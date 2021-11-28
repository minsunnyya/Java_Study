package Chapter11_Collection;
import java.util.*;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();//대문자->소문자 순 정렬 오름차순

        String from = "a";
        String to = "d";

        set.add("abc"); set.add("ffew"); set.add("bgf");
        set.add("sd"); set.add("ac"); set.add("tre");
        set.add("bgd"); set.add("ter"); set.add("bmn");
        set.add("er"); set.add("dvf"); set.add("ljk");
        set.add("Cbc");

        System.out.println(set);
        System.out.println("from: "+from+" ,to: "+to);
        System.out.println(set.subSet(from,to));
        System.out.println(set.subSet(from,to+"zzz"));//끝범위에 추가


    }
}
