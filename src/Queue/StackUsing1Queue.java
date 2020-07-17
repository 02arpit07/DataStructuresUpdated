package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {
    public static void main(String[] args)
    {
        StackUsing1Queue st=new StackUsing1Queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());


    }
      Queue<Integer> q=new LinkedList<>();
     void push(int item)
    {
        int size=q.size();
        q.add(item);
        for(int i=0;i<size;i++)
        {
            q.add(q.remove());
        }
    }
    int pop()
    {
        int a=q.remove();
        return a;
    }
    int top()
    {
        if(q.size()<=0)
        {
            return -1;
        }
        return q.peek();
    }
}
//in push we have added an element at end of queue and the remove all elements from queue and insert the them at end
//turn by turn.
