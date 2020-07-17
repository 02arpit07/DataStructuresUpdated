package LinkedList;

public class InsertInSortedLL {
    Node head;
    public static void main(String[] args)
    {
        InsertInSortedLL al=new InsertInSortedLL();
        al.insert(1);
        al.insert(2);
        al.insert(3);
        al.insert(4);
        al.insert(6);
        al.printlist();
        al.insertSorted(5);
        al.printlist();


    }
    void insert(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    void printlist()
    {
        Node n=head;
        while(n.next!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println(n.data);
    }
    void insertSorted(int data)
    {
        Node node=new Node(data);
        Node n=head;
        Node prev=head;
        while(n.data>data)
        {
            prev=n;
            n=n.next;
        }
        prev.next=node;
        node.next=n;
    }

}
