package BinaryTree;

public class PrintLeafNodes {
    static Node root;
    public static void printleaf(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            System.out.print(root.key+" ");
        }
        printleaf(root.left);
        printleaf(root.right);
    }
    public static void main(String[] args)
    {
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        printleaf(root);

    }
}
