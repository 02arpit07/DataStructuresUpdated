package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    static Queue<Integer> queue;
    public static void main(String[] args)
    {
        queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        reverseQueue();
        print();



    }
    static void reverseQueue()
    {
        Stack<Integer> st=new Stack<>();
        while (!queue.isEmpty())
        {
            st.push(queue.peek());
            queue.poll();
        }
        while(!st.isEmpty())
        {
            queue.add(st.pop());
        }
    }
    static void print()
    {
        while(!queue.isEmpty())
        {
            System.out.print(queue.peek()+" ");
            queue.poll();
        }
    }
}
