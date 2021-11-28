package Chapter11_Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("=stack=");
        while(!st.empty()){//스택이 비지 않을때까지 반복
            System.out.println(st.pop());//스택은 LIFO
        }

        System.out.println("=Queue=");
        while (!q.isEmpty()){
            System.out.println(q.poll());//큐는 FIFO
        }
    }
}
