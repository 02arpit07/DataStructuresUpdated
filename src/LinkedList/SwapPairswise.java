package LinkedList;

public class SwapPairswise {
    static Node head;
    public static void main(String[] args)
    {
        SwapPairswise sp=new SwapPairswise();
        sp.push(1);
        sp.push(2);
        sp.push(3);
        sp.push(4);
        sp.push(5);
        sp.push(6);
        sp.display();
        sp.swapPairs();
        sp.display();

    }
    public static Node swapPairs()
    {
        Node temp=head;
        while(temp!=null&&temp.next!=null)
        {
            int res=temp.data;
            temp.data=temp.next.data;
            temp.next.data=res;
            temp=temp.next.next;
        }
        return head;

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
}
