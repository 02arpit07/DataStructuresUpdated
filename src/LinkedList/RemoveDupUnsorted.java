package LinkedList;
//this can work for both sorted and unsorted linked list

import java.util.HashSet;

public class RemoveDupUnsorted {

    Node head;
    public static void main(String[] args)
    {
        RemoveDupUnsorted rds=new RemoveDupUnsorted();
        rds.push(1);
        rds.push(19);
        rds.push(2);
        rds.push(8);
        rds.push(7);
        rds.push(7);
        rds.push(19);
        rds.push(1);
        rds.push(1);
        rds.push(4);
        rds.display();
        rds.removeDuplicUnsorted();
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
    public void removeDuplicUnsorted()
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        Node current=head;
        Node previous =null;
        while(current!=null)
        {
            int curval=current.data;
            if(hs.contains(curval))
            {
                previous.next=current.next;
            }
            else{
                hs.add(curval);
                previous=current;
            }
            current=current.next;
        }

    }
}
