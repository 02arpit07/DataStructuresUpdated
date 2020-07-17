package LinkedList;

public class LinkedListDeletion {
    Node head;
    public void insertFirst(int data)
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
    public void deleteFirst()
    {
        Node temp=head;
        temp=temp.next;
        head=temp;
    }
    public void deleteLast()
    {
        Node n=head,temp=null;
        while(n.next!=null)
        {
            temp=n;
            n=n.next;
        }
        temp.next=null;
    }
    public void deleteAt(int pos)
    {
        Node n=head;
        if(pos==0)
        {
            deleteFirst();
        }
        else{
            for(int i=1;i<pos;i++)
            {
                n=n.next;
            }
            n.next=n.next.next;
        }
    }
    public void deleteByValue(int data)
    {
        Node n=head;
        Node temp=null;
        while(n.data!=data)
        {
            temp=n;
            n=n.next;
        }
        temp.next=n.next;
    }
    public static void main(String[] args)
    {
        LinkedListDeletion lld=new LinkedListDeletion();
        lld.insertFirst(1);
        lld.insertFirst(2);
        lld.insertFirst(3);
        lld.insertFirst(4);
        lld.insertFirst(5);
        lld.insertFirst(6);
        lld.insertFirst(7);
        lld.display();
        lld.deleteFirst();
        lld.display();
        lld.deleteLast();
        lld.display();
        lld.deleteAt(3);
        lld.display();
        lld.deleteByValue(5);
        lld.display();

    }

    //Deleting a node if we dont know prev of node in singly linked list
    //copy data of next in current node and then delete the next Node.
    void deleteNode(Node node)
    {
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
