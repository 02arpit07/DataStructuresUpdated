package LinkedList;

public class DetectLoopFloydCycle {
    Node head;
    public static void main(String[] args)
    {
        DetectLoopFloydCycle dl=new DetectLoopFloydCycle();
        dl.push(1);
        dl.push(2);
        dl.push(3);
        dl.push(4);
        dl.push(5);
        dl.push(6);
       // dl.head.next.next.next.next.next.next=dl.head;
        dl.detectloop();

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
   public void detectloop()
   {
       Node slow=head;
       Node fast=head;
       int flag=0;
       while(slow!=null && fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               System.out.println("Loop found");
               flag=1;
               break;
           }
       }
       if(flag!=1)
       {
           System.out.println("NO loop");
       }
   }
}
