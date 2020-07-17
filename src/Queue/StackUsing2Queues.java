package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    int currsize;
    public StackUsing2Queues()
    {
        currsize=0;
    }
     void push(int data)
    {
        q1.add(data);
        currsize++;
    }
    int pop()
    {
        if(q1.isEmpty())
        {
            return -1;
        }
        currsize--;
        while(q1.size()!=1)
        {
            q2.add(q1.poll());
        }
        int temp=q1.peek();
        q1.remove();
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
        return temp;
    }
    int size()
    {
        return currsize;
    }
    public static void main(String[] args)
    {
        StackUsing2Queues s=new StackUsing2Queues();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());

    }

}
/*
Here we have made pop costly.
1- Just push all elements simply using add in q1.
2-Now we need to pop out the recently added elements.So shift all elements from q1 to q2 except last one.
3- now we need to remove last element.
4-Now swap the names of queues.
 */
