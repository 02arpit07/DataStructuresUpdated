package BinaryTree;

public class NodeWithoutSibling {
    static Node root;
    public static void printNodeWS(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right!=null)
        {
            System.out.println(root.right.key);
        }
        if(root.left!=null&&root.right==null)
        {
            System.out.println(root.left.key);
        }
        printNodeWS(root.left);
        printNodeWS(root.right);
    }
    public static void main(String[] args)
    {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.left.left.left=new Node(6);
        node.right.right=new Node(7);
        printNodeWS(node);
    }
}
