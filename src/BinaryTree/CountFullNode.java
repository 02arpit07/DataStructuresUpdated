package BinaryTree;

//FULL NODE IS THE NODE WITH BOTH CHILDS. SO WE HAVE TO COUNT THE NUMBER OF FULL NODES PRESENT IN OUR TREE.
public class CountFullNode {
    static Node root;

    static int getFullNodeCount(Node temp)
    {
        if(temp==null)
        {
            return 0;
        }
        int res=0;
        if(temp.left!=null&&temp.right!=null)
        {
            res++;
        }
        res=res+(getFullNodeCount(temp.left)+getFullNodeCount(temp.right));
        return res;
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

        int result=getFullNodeCount(root);
        System.out.println(result);

    }
}
