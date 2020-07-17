package LinkedList;

import java.util.Scanner;

public class ScanLinkedList {
    static Node head;
    public static void main(String[] args)
    {
        ScanLinkedList ll=new ScanLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Linkedlist");
        int n =sc.nextInt();
        System.out.println("Now Enter data you want to insert in each node");
        for(int i=0;i<n;i++)
        {
            int b=sc.nextInt();
            ll.AddFromStart(b);
        }

        ll.display();

    }
    static void AddFromStart(int data)
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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
