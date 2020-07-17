package BinaryTree;

public class RemoveLeaf {
    static Node root;
    public static Node removeLeaf(Node root)
    {
        if(root==null)
        {
            return null;
        }
        if(root.left==null&&root.right==null)
        {
            root=null;
        }
        if(root!=null&&root.left!=null)
        {
            root.left=removeLeaf(root.left);
        }
        if(root!=null&&root.right!=null)
        {
            root.right=removeLeaf(root.right);
        }
        return root;
    }
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
    public static void main(String[] args)
    {
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        Inorder(root);
       removeLeaf(root);
       System.out.println();
       System.out.print("After removal");
       Inorder(root);

    }
}
