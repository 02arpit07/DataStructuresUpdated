package LinkedList;
//Iterative solution
public class LengthOfLL {
    Node head;
    public static void main(String [] args)
    {
        LengthOfLL ll = new LengthOfLL();
        ll.push(1);
        ll.push(4);
        ll.push(1);
        ll.push(12);
        ll.push(1);
        System.out.println("Length of LL is "+ll.count());


    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public int count()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
