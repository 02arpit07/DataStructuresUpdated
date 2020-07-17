package LinkedList;

public class SwapNodesByChangingLinks {
    public static void main(String[] args)
    {
        SwapNodesByChangingLinks sn=new SwapNodesByChangingLinks();
        sn.push(1);
        sn.push(2);
        sn.push(3);
        sn.push(4);
        sn.push(5);
        sn.push(6);
        sn.display();
        sn.swapNodes(head,1,6);
        sn.display();

    }
    static Node head;
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public Node swapNodes(Node node, int x,int y)
    {
        if(x==y)
        {
            return null;
        }
        Node a=null;
        Node b =null;
        while(node.next!=null)
        {
            if(node.next.data==x)
            {
                a=node;
            }
            else if(node.next.data==y)
            {
                b=node;
            }
            node=node.next;
            }
        if(a!=null&&b!=null){
            Node temp=a.next;
            a.next=b.next;
            b.next=temp;
            temp=a.next.next;
            a.next.next=b.next.next;
            b.next.next=temp;
        }
        return head;
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
