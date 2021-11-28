package Chapter11_Collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_8 {
    public static void main(String[] args) {
        Integer[] arr={30,50,10,40,20};

        Arrays.sort(arr);//오름차순 정렬 compareTo()
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,new DescComp());
        System.out.println(Arrays.toString(arr));
    }
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2){
        if(!(o1 instanceof Integer && o2 instanceof Integer))
            return -1;//Integer가 아니면 비교하지 않고 -1반환

        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i.compareTo(i2)*-1;
    }
}