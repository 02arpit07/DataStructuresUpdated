package LinkedList;

public class ReverseLL {
    Node head;
    public static void main(String[] args)
    {
        ReverseLL  rl=new ReverseLL();
        rl.push(7);
        rl.push(6);
        rl.push(5);
        rl.push(4);
        rl.push(3);
        rl.push(2);
        rl.push(1);
        rl.display();
        rl.reverse();
        rl.display();
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
    public void reverse()
    {
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
}
