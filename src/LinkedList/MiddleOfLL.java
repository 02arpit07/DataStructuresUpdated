package LinkedList;

public class MiddleOfLL {
    Node head;
    public static void main(String[] args)
    {
        MiddleOfLL ml=new MiddleOfLL();
        ml.push(10);
        ml.push(20);
        ml.push(30);
        ml.push(40);
        ml.push(50);
        ml.push(60);
        ml.push(70);
        ml.display();
        ml.Middle();
        ml.MiddleMethod2();
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
    public void Middle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public void MiddleMethod2()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count/2;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
