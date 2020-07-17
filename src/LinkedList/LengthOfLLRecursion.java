package LinkedList;

public class LengthOfLLRecursion {
    Node head;
    public static void main(String [] args)
    {
        LengthOfLLRecursion ll = new LengthOfLLRecursion();
        ll.push(1);
        ll.push(4);
        ll.push(1);
        ll.push(12);
        ll.push(1);
        ll.push(20);
        System.out.println("Length of LL is "+ll.countByRec(ll.head));


    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public int countByRec(Node node)
    {
        if(node==null)
            return 0;

        return 1+countByRec(node.next);

    }
}
