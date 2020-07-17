package LinkedList;
//WE HAVE USED FLOYD CYCLE METHOD TO RETURN LENGTH OF LOOP HERE.
public class DetectLoopLength {
    Node head;
    public static void main(String[] args)
    {
        DetectLoopLength dll=new DetectLoopLength();
        dll.push(1);
        dll.push(2);
        dll.push(3);
        dll.push(4);
        dll.push(5);
        dll.push(6);
        dll.head.next.next.next.next.next.next=dll.head.next.next.next;
        System.out.print(dll.detectloop(dll.head));
    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public int detectloop(Node n)
    {
        Node slow=n;
        Node fast=n;
        while(slow!=null&&fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return countLoop(slow);
            }
        }
        return 0;
    }
    public int countLoop(Node a)
    {
        int count=1;
        Node temp=a;
        while(temp.next!=a)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
