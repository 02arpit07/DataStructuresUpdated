package LinkedList;
//These whole codes are done by myself.And suddenly i feel my logic building has improved a bit.
public class GetNthNodeFromEnd {
    Node head;//head of LL
    public static void main(String[] args)
    {
        GetNthNodeFromEnd gn=new GetNthNodeFromEnd();
        gn.insertAtLast(10);
        gn.insertAtLast(21);
        gn.insertAtLast(23);
        gn.insertAtLast(42);
        gn.insertAtLast(433);
        gn.insertAtLast(55);

        gn.display();
        System.out.println(gn.getNthByEnd(2));
        System.out.println(gn.getNthFromLastAlt(2));
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
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public int getNthByEnd(int x)
    {
        Node temp=head;
        Node temp1=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(x<=count) {
            for (int i = 0; i < count - x - 1; i++) {
                temp1 = temp1.next;
            }
            return temp1.data;
        }
        assert (false);
        return -1;
    }
    int getNthFromLastAlt(int x)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(x>count)
        {
            return -1;
        }
        temp=head;
        while(count-x!=1)
        {
            temp=temp.next;
            count--;
        }
        return temp.data;
    }
}
