package Stack;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    public void enqueue(int data)
    {
        st1.push(data);
    }
    public int dequeue()
    {
        int data=0;
        if(!st2.isEmpty())
        {
            data=st2.peek();
            st2.pop();
            return data;
        }
        else{
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            data=st2.peek();
            st2.pop();
            return data;
        }
    }
    public void display()
    {
        for(int i:st2)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        QueueUsingStack q=new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);


        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
       System.out.println(q.dequeue());


    }
}
