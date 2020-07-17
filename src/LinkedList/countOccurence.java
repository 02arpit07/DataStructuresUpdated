package LinkedList;

public class countOccurence {
    Node head;
    public static void main(String[] args)
    {
        countOccurence ml=new countOccurence();
        ml.push(10);
        ml.push(40);
        ml.push(30);
        ml.push(40);
        ml.push(50);
        ml.push(60);
        ml.push(40);
        ml.display();
        System.out.println(ml.countoccur(40));

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
    public int countoccur(int x)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
}
