package LinkedList;

public class SearchElementRecursive {
    Node head;
    public static void main(String[] args)
    {
        SearchElementRecursive s=new SearchElementRecursive();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        if(!s.Search(s.head,10))
        {
            System.out.println("False it is");
        }
        else{
            System.out.println("True it is");
        }
    }
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public boolean Search(Node head,int x)
    {
        Node temp=head;
        if(head==null)
            return false;

        if(head.data==x)
        {
            return true;
        }
        return Search(temp.next,x);
    }
}
