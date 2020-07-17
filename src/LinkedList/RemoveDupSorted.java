package LinkedList;

public class RemoveDupSorted {
    Node head;
    public static void main(String[] args)
    {
        RemoveDupSorted rds=new RemoveDupSorted();
        rds.push(1);
        rds.push(1);
        rds.push(2);
        rds.push(8);
        rds.push(111);
        rds.push(111);
        rds.push(111);
        rds.push(7);
        rds.push(7);
        rds.display();
        rds.removedupSorted();
        System.out.println("after removal");
        rds.display();
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
    public void removedupSorted()
    {
        Node node=head;
        Node q;
        while(node!=null &&node.next!=null){
            if(node.data==node.next.data)
            {
                q=node.next.next;
                if(q==null)
                {
                    node.next=null;
                    break;
                }
                node.next=q;
            }
            else
            {
                node=node.next;
            }
        }
    }
}
