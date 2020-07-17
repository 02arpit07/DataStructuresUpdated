package LinkedList;

public class LinkedlistInsertion {
    Node head;
    public void insertAtStart(int data)
    {
     Node temp=new Node(data);
     temp.next=head;
     head=temp;
    }
    public void insertAt(int data,int pos)
    {
        Node node=new Node(data);
        if(pos==0)
        {
            insertAtStart(data);
        }
        else{
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }
    }
    public void insertAtLast(int data)
    {
        Node temp=head;
        Node node =new Node(data);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
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
        //System.out.print(temp.data);
    }
    public static void main(String[] args)
    {
        LinkedlistInsertion lli=new LinkedlistInsertion();
        lli.insertAtStart(8);
        lli.insertAtStart(9);
        lli.insertAtStart(10);
        lli.insertAtStart(11);
        lli.insertAtStart(12);
        lli.insertAtStart(13);
        lli.insertAt(14,3);
        lli.display();
        lli.insertAtLast(7);
        lli.display();
        lli.insertAtLast(6);
        lli.insertAtLast(5);
        lli.insertAt(4,2);
        lli.display();
    }
}
/* OUTPUT
13 12 11 14 10 9 8
13 12 11 14 10 9 8 7
13 12 4 11 14 10 9 8 7 6 5

 */
