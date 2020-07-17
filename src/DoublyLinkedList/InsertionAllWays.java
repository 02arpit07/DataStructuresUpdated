package DoublyLinkedList;

public class InsertionAllWays {
    Node head;
    public static void main(String[] args)
    {
        InsertionAllWays is=new InsertionAllWays();
        is.insertAtStart(1);
        is.insertAtStart(2);
        is.insertAtStart(3);
        is.insertAtStart(4);
        System.out.println("After inserting Node at Beginning of Linkedlist");
        is.printList();
        is.insertAfterGivenNode(is.head.next,5);
        System.out.println("After insertinf 5 after node at position 1. ");
        is.printList();
        is.insertAtEnd(2);
        is.insertAtEnd(3);
        is.insertAtEnd(4);
        System.out.println("Inserting at End of LL");
        is.printList();
        is.insertBefore(is.head.next,6);
        System.out.println("Insrted 6 at a position prev to next of head");
        is.printList();
    }
    public void insertAtStart(int data)
    {
        Node node =new Node(data);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void insertAfterGivenNode(Node prev_node,int data)
    {
        if(prev_node==null)
        {
            System.out.println("Previous Node cannot be null");
            return;
        }
        Node node=new Node(data);
        node.next=prev_node.next;
        node.prev=prev_node;
        prev_node.next=node;
        if(node.next!=null)
        {
            node.next.prev=node;
        }

    }
    public void insertAtEnd(int data)
    {
        Node temp=head;
        Node node=new Node(data);
        //node.next=null; // it is by default
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }
    public void insertBefore(Node target,int data)
    {
        Node node=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=node;
            node.prev=null;
            return;
        }
        while(temp!=target)
        {
            temp=temp.next;
        }
        node.next=temp;
        node.prev=temp.prev;
        temp.prev.next=node;
        node.prev=node;

    }
    public void printList()
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
