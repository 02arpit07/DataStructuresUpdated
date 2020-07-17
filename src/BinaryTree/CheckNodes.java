package BinaryTree;

public class CheckNodes {
    static Node temp;
    static boolean checkNode(Node temp,int key)
    {
        if(temp==null)
        {
            return false;
        }
        if(temp.key==key)
        {
            return true;
        }
        boolean ans=checkNode(temp.left,key);
        boolean ans1=checkNode(temp.right,key);
        return ans||ans1;
    }
    public static void main(String[] args)
    {
    /* 2
    / \
    7 5
    \ \
    6 9
    / \ /
    1 11 4
    Let us create Binary Tree as shown
    */

        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left=new Node(99);
        root.left.right = new Node(6);
        root.left.right.left = new Node(1);
        root.left.right.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);

        boolean result=checkNode(root,7);
        System.out.println(result);

    }
}
