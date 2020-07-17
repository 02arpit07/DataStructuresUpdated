package LinkedList;

public class MoveLastNodeToFirst {
    public static void main(String[] args)
    {
        MoveLastNodeToFirst ml=new MoveLastNodeToFirst();
        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);
        ml.display();
        ml.lastToFirst();
        ml.display();


    }
    static Node head;
    static void add(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    static Node lastToFirst()
    {
        Node temp=head;
        Node secondlast=null;
        while(temp.next!=null)
        {
            secondlast=temp;
            temp=temp.next;
        }
        secondlast.next=null;
        temp.next=head;
        head=temp;
        return head;
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
}
