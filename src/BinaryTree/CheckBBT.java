package BinaryTree;

public class CheckBBT {
    static Node root;
    public static void main(String[] args)
    {
        root = new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.right=new Node(4);


        if(isBBT(root))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean isBBT(Node root)
    {
        if(root==null)
        {
            return true;
        }
        int lt=height(root.left);
        int rt=height(root.right);
        if(Math.abs(lt-rt)<=1&&isBBT(root.left)&&isBBT(root.right))
        {
            return true;
        }
        else{
            return false;
        }
    }
    static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
}
