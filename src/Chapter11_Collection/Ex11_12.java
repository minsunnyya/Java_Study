package Chapter11_Collection;

import java.util.*;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1"); setA.add("2"); setA.add("3");
        setA.add("4"); setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4"); setB.add("5"); setB.add("6");
        setB.add("7"); setB.add("8");
        System.out.println("B = "+setB);

        Iterator it = setB.iterator();//저장순서와 동일하게 읽어옴
        while(it.hasNext()){//boolean hasNext() 읽어올 요소가 있는지 확인
            Object tmp = it.next();//Object next() 다음 요소를 읽어옴
            if(setA.contains(tmp))
                setKyo.add(tmp);
            System.out.print(tmp);
        }

        System.out.println();

        it = setA.iterator();//저장순서와 동일하게 읽어옴
        while(it.hasNext()){
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);

            System.out.println(setKyo);
        }

        it = setA.iterator();
        while (it.hasNext())
            setHab.add(it.next());
        System.out.println(setHab);

        it = setB.iterator();
        while (it.hasNext())
            setCha.add(it.next());
        System.out.println(setCha);

    }
}
