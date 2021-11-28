package Chapter11_Collection;

import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바",90);
        map.put("이자바",100);
        map.put("박자바",40);
        map.put("최자바",60);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : "+e.getKey()+", 점수: "+e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : "+set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()){
            int i = (int)it.next();
            total += i;
        }

        System.out.println(total);
    }

}
