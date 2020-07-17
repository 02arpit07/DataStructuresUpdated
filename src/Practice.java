public class Practice {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public static void main(String[] args)
    {
        Practice p=new Practice();
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(40);



    }
    static Node head;
    public static void add(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;

    }


}
