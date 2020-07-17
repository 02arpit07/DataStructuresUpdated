package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOf2LL {
    static Node head;
    public static void main(String[] args)
    {
        IntersectionOf2LL il=new IntersectionOf2LL();
        il.add(1);
        il.add(2);
        il.add(3);
        il.add(4);
        IntersectionOf2LL il2=new IntersectionOf2LL();
        il2.add(3);
        il2.add(4);
        il2.add(5);
        getIntersection(il.head,il2.head);
    }
    static void add(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    static void getIntersection(Node illll,Node illll2)
    {
        Node il=illll;
        Node il2=illll2;
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        while(il!=null)
        {
            if(!hs.contains(il.data))
            {
                hs.add(il.data);
            }
            il=il.next;
        }
        while(il2!=null)
        {
            if(hs.contains(il2.data))
            {
                al.add(il2.data);
            }
            il2=il2.next;
        }
        Iterator<Integer> itr=al.iterator();
        System.out.println("Intersection of these two linked list are");
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
