package LinkedList;

public class SortLLcontaing012 {

    static Node head;
    public static void main(String[] args)
    {
        add(1);
        add(1);
        add(0);
        add(2);
        add(1);
        print();
        sort();

        print();

    }
    static void add(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else {
            node.next = head;
            head = node;
        }
    }
    static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void sort()
    {
        int[] arr={0,0,0};
        Node temp=head;
        while(temp!=null)
        {
            arr[temp.data]++;
            temp=temp.next;
        }
        int i=0;
        temp=head;
        while (temp!=null)
        {
            if (arr[i]==0)
            {
                i++;
            }
            else{
                temp.data=i;
                --arr[i];
                temp=temp.next;
            }
        }
    }
}
