package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveTheFirstAndLastHalfQueue {
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        PrintInterleave(q);
    }
    static void PrintInterleave(Queue<Integer> q)
    {
        if(q.size()%2!=0)
        {
            System.out.println("Please enter Even number of digites into the queue");
            return;
        }
        int halfsize=q.size()/2;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<halfsize;i++)
        {
            st.push(q.peek());
            q.poll();
        }
        int m=st.size();
        for(int i=0;i<m;i++)
        {
            q.add(st.pop());
        }
        int[] arr=new int[q.size()];
        int n =q.size();
        for(int i=0;i<n;i++)
        {
            arr[i]=q.poll();
        }
        int r=arr.length-1;
        int l=0;
        while(l<r)
        {
            System.out.print(arr[r]+" ");
            System.out.print(arr[l]+" ");
            l++;
            r--;
        }
       // System.out.println("1");


    }

}
