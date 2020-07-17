package LinkedList;

public class GetNthNode {
    Node head;
    public static void main(String[] args)
    {
        GetNthNode gn=new GetNthNode();
        gn.insertAtLast(10);
        gn.insertAtLast(21);
        gn.insertAtLast(23);
        gn.insertAtLast(42);
        gn.insertAtLast(433);
        gn.insertAtLast(55);

        gn.display();
        System.out.println(gn.getNth(0));
        System.out.print(gn.getNthAlt(3));
    }
    public void insertAtLast(int data)
    {
        Node temp=head;
        Node node =new Node(data);
        if(head==null)
        {
            node.next=head;
            head=node;
        }
        else{
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    }
    public void display()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    public int getNth(int x)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(count==x)
            {
                return temp.data;
            }
            count++;
            temp=temp.next;
        }
        assert (false);
        return -1;
    }
     int getNthAlt(int x)
    {
        Node temp=head;
        int count=0;
        while(count!=x-1)
        {
            temp=temp.next;
            count++;
        }
        return temp.next.data;
    }
}
