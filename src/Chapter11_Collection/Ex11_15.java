package Chapter11_Collection;

import java.util.*;

public class Ex11_15 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {12,45,67,89,98,97,10};

        for (int i = 0; i<score.length;i++)
            set.add(new Integer(score[i]));

        System.out.println(set.headSet(new Integer(50)));
        System.out.println(set.tailSet(new Integer(50)));
    }
}
