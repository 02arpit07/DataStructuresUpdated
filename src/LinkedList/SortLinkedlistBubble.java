package LinkedList;

public class SortLinkedlistBubble {
    static Node head;
    public static void main(String[] args)
    {
        add(1);
        add(145);
        add(0);
        add(2);
        add(1456);
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
    public static void sort() {

        Node temp2=head;
        int size=0;
        while (temp2!=null)
        {
            size++;
            temp2=temp2.next;
        }
        if (size > 1) {
            for (int i = 0; i < size; i++ ) {
                Node currentNode = head;
                Node nextNode = head.next;
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.data > nextNode.data) {
                        int temp = currentNode.data;
                        currentNode.data = nextNode.data;
                        nextNode.data = temp;
                    }
                    currentNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
        }
    }
}
