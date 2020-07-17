package LinkedList;

import java.util.HashSet;

public class DetectLoop {
    Node head;
    public static void main(String[] args)
    {
        DetectLoop dl=new DetectLoop();
        dl.push(1);
        dl.push(2);
        dl.push(3);
        dl.push(4);
        dl.push(5);
        dl.push(6);
        dl.head.next.next.next.next.next.next=dl.head;
        if(dl.detectloop(dl.head))
        {
            System.out.println("LOOP");
        }
        else{
            System.out.println("NO LOOP");
        }
    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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
