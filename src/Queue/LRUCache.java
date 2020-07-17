package Queue;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
    public static void main(String[] arrgs)
    {
        LRUCache ca=new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(4);
        ca.refer(5);
        ca.refer(2);
       // ca.refer(5);
        //ca.refer(5);
        ca.display();
    }
    static Deque<Integer> dq;
    static HashSet<Integer> hs;
    static int fsize;
    public LRUCache(int framesize)
    {
        dq= new LinkedList<>();
        hs=new HashSet<>();
        fsize=framesize;
    }
    static void refer(int n)
    {
        if(!hs.contains(n))
        {
            if(dq.size()==fsize)
            {
                int temp=dq.removeLast();
                hs.remove(temp);
            }
        }
        else{
            int index=0,i=0;
            Iterator<Integer> itr=dq.iterator();
            while(itr.hasNext())
            {
                if(itr.next()==n)
                {
                   index=n;
                   break;
                }
            }
           dq.remove(index);
        }
        //these two line would execute everytime after if or else.
        dq.push(n);
        hs.add(n);

    }
    public void display()
    {
        Iterator<Integer> itr=dq.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
