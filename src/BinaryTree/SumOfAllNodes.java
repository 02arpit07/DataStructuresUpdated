package BinaryTree;

public class SumOfAllNodes {
    static Node root;
    public static int sumOfAllNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=sumOfAllNodes(root.left);
        int r=sumOfAllNodes(root.right);

        return root.key+l+r;
    }
    public static void main(String[] arggs)
    {
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        int sum=sumOfAllNodes(root);
        System.out.println(sum);
    }
}
