package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//A simple method to sort a queue could be to shift all elements into an array and the sort an array and
//shift back all elements in queue.(But it require extra space)
public class SortAQueue {
    static Queue<Integer> q;
    public static void main(String[] args)
    {
        SortAQueue sq=new SortAQueue();
        q=new LinkedList<>();
        q.add(10);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(1);
        sort();
        print();


    }
    public static void sort()
    {
        int[] arr=new int[q.size()];
        int qsize=q.size();
        for(int i=0;i<qsize;i++)
        {
            arr[i]=q.poll();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            q.add(arr[i]);
        }

    }
    public static void print()
    {
        int qsize=q.size();
        for(int i=0;i<qsize;i++)
        {
            System.out.print(q.poll()+" ");
        }
    }
}
