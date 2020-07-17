package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintUniqueElementsinLL {
    Node head;
    Node result;
    public static void main(String[] args)
    {
        PrintUniqueElementsinLL rds=new PrintUniqueElementsinLL();
        rds.push(1);
        rds.push(1);
        rds.push(2);
        rds.push(8);
        rds.push(111);
        rds.push(111);
        rds.push(111);
        rds.push(7);
        rds.push(7);
        rds.display();
        rds.removedupSortedAltern();
        System.out.println("after removal");
        rds.display();
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
    public Node removedupSorted()
    {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            if(hs.contains(temp.data))
            {
                al.add(temp.data);
            }
            hs.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        Node x=head;

        while (temp.next!=null)
        {
            temp=temp.next;

            if(al.contains(temp.data))
            {
                x.next=temp.next;
            }
            x=x.next;
        }
        return x;
    }

    public void removedupSortedAltern()
    {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(hs.contains(temp.data))
            {
                al.add(temp.data);
            }
            count++;
            hs.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(al.contains(temp.data))
            {
                temp=temp.next;
                continue;
            }
            else{
                Node node=new Node(temp.data);
                node.next=result;
                result=node;
                temp=temp.next;
            }

        }
         head=result;


    }
}
