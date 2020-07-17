package BinaryTree;

public class CheckMirrorTree {
    public static void main(String[] args)
    {
        Node root1=new Node(1);
        Node root2=new Node(1);
        root1.left=new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        root2.right=new Node(2);
        root2.left = new Node(3);
        root2.right.right = new Node(4);
        root2.right.left = new Node(5);

        if(AreMirror(root1,root2))
        {
            System.out.println("Both trees are mirror of each other");
        }
        else{
            System.out.println("No both are not mirror of each other");
        }
    }
    static boolean AreMirror(Node root1,Node root2)
    {
        if(root1==null&&root2==null)
        {
            return true;
        }
        if(root1==null||root2==null)
        {
            return false;
        }
        return  root1.key==root1.key &&AreMirror(root1.left,root2.right)&&AreMirror(root1.right,root2.left);
    }
}
