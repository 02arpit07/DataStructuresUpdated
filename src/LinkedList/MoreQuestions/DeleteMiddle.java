package LinkedList.MoreQuestions;

public class DeleteMiddle {
    static Node head;
    public static void main(String[] args)
    {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        print();
        deleteMiddle();
        print();

    }
    static void add(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else {
            node.next = head;
            head = node;
        }
    }
    static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void deleteMiddle()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int count2=1;
        temp=head;
        while(count2!=(count/2)&&temp!=null)
        {
            count2++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}
