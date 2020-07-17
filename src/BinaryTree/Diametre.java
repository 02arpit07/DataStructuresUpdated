package BinaryTree;
//The diameter of a tree (sometimes called the width) is
// the number of nodes on the longest path between two leaves in the tree.
public class Diametre {
    static Node root;
    public static int getDiametre(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lheight=height(root.left);
        int rheight=height(root.right);
        int ldia=getDiametre(root.left);
        int rdia=getDiametre(root.right);
        int result=Math.max(lheight+rheight+1,Math.max(ldia,rdia));
        return result;
    }
    //HERE IT IS USED AS A UTILITY FUNCTION.
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l = height(root.right);
        int r=height(root.left);
        return Math.max(l,r)+1;
        //return result;
    }
    public static void main(String args[])
    {

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.right = new Node(5);

        System.out.println(getDiametre(root1));
    }
}
