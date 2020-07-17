package BinaryTree;

public class Height {
    static Node root;
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int l=height(root.left)+1;
        int r = height(root.right)+1;
        return Math.max(l,r);
        //return result;
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
        root.left.right.left.right = new Node(1);
        root.left.right.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);

        int result=height(root);
        System.out.println(result);

    }
}
