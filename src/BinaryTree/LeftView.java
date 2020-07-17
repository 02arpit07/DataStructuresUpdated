package BinaryTree;

public class LeftView {
    static Node root;
    static int maxlev=0;
    public static void main(String[] arggs)
    {

        root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        leftView(root,1);
    }
    static void leftView(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(maxlev<level)
        {
            System.out.print(root.key+" ");
            maxlev=level;
        }
        leftView(root.left,level+1);
        leftView(root.right,level+1);
    }

}
