package BinaryTree;

public class MinAndMax {
    static Node root;
    public static void main(String[] args)
    {
        root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(250);
        root.right.right = new Node(40);

        int max=findMax(root);
        System.out.println("Maximum value of node present in node is ==  "+max);

        int min=findMin(root);
        System.out.println("minimum value of node present in node is ==  "+min);
        System.out.print(Integer.MAX_VALUE);


    }
    static int findMax(Node root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        //We should always consider the smallest part of tree to think of logic and then repeat that for all cases using recursion
        int res=root.key;
        int leftres=findMax(root.left);
        int rightres=findMax(root.right);
        if(res<leftres)
        {
            res=leftres;
        }
        if(res<rightres)
        {
            res=rightres;
        }
        return res;
    }
    static int findMin(Node root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int res=root.key;
        int lres=findMin(root.left);
        int rres=findMin(root.right);
        if(res>lres)
        {
            res=lres;
        }
        if(res>rres)
        {
            res=rres;
        }
        return res;
    }
}
