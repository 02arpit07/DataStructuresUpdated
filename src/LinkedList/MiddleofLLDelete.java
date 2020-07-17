package LinkedList;

public class MiddleofLLDelete {
    Node head;
    public static void main(String[] args)
    {
        MiddleofLLDelete mld=new MiddleofLLDelete();
        mld.push(1);
        mld.push(2);
        mld.push(3);
        mld.push(4);
        mld.push(5);
        mld.push(6);
        mld.push(6);
        mld.display();
        mld.DeleteMiddle(mld.head);
        mld.display();
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
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public Node DeleteMiddle(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node prev=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}
/*
if we want to replace middle element with a particular number say,
 Node node=new Node(333);
        prev.next=node;
        node.next=slow.next;
        return head;
 */
