package LinkedList;

import java.util.HashSet;

public class DetectAndRemoveLoop {
    public static void main(String[] args)
    {
        DetectAndRemoveLoop d=new DetectAndRemoveLoop();
        d.push(20);
        d.push(4);
        d.push(15);
        d.push(10);
       // d.head.next.next.next.next=d.head.next;
        boolean b=d.detectloop(head);
        System.out.println(b);
        d.detectAndremoveLoop(head);
        boolean c=d.detectloop(head);
        System.out.println(c);


    }
   static Node head;
    public static void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public static void detectAndremoveLoop(Node a)
    {
        HashSet<Node> hs=new HashSet<>();
        Node temp=a;
        while(temp!=null)
        {
            temp=temp.next;
            if(hs.contains(temp))
            {
                a.next=null;
                break;
            }
            hs.add(temp);
            a=a.next;
        }
    }
    public boolean detectloop(Node h)
    {
        HashSet<Node> hs=new HashSet<Node>();
        while(h!=null)
        {
            if(hs.contains(h))
            {
                return true;
            }
            hs.add(h);
            h=h.next;
        }
        return false;
    }
}
