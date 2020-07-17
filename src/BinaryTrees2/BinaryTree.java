package BinaryTrees2;

public class BinaryTree {
    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.println("Sum of all nodes is "+getSum(root));//Sum of all nodes.
        System.out.println("diff of even and odd level node is "+getDiff(root));//Differnce between sum of even level andd  sum of odd levels
        System.out.println("total nodes are "+countNodes(root));
        System.out.println("Total leaf Nodes are "+countLeafNodes(root));
        System.out.println("height of particular node is "+Height(root));
    }
    public static  int getSum(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return node.data+getSum(node.left)+getSum(node.right);
    }
    public static int getDiff(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return node.data-getDiff(node.left)-getDiff(node.right);
    }
    public static int countNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public static int countLeafNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return 1;
        }
        return countLeafNodes(root.left)+countLeafNodes(root.right);
    }
    public static int Height(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return Max(Height(node.left),Height(node.right))+1;
    }
    //utility function
    static int Max(int a,int b)
    {
        return a>b?a:b;
    }

}
