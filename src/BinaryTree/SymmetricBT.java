package BinaryTree;

public class SymmetricBT {
    static Node root;
    public static void main(String args[])
    {
        SymmetricBT tree = new SymmetricBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = tree.isSymmetric(tree.root);
        if (output == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
    static boolean isSymmetric(Node root)
    {
        return checkIsSymmetric(root,root);
    }
    static boolean checkIsSymmetric(Node root1,Node root2)
    {
        if(root1==null&&root2==null)
        {
            return true;
        }
        if(root1!=null&&root2!=null&&root1.key==root2.key)
        {
            return checkIsSymmetric(root1.left,root2.right)&&checkIsSymmetric(root1.right,root2.left);

        }
        return false;
    }
}
