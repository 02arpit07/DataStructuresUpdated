package BinaryTree;

public class DFSTraversal {
    static Node root;
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.key+" ");
        Inorder(root.right);
    }
    public static void Postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.key+" ");
    }
    public static void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.key+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args)
    {

        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        Preorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        Postorder(root);

    }
}
