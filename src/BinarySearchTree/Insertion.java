package BinarySearchTree;
//Insertion , Inorder Traversal(gives us elements in sorted form),MaxValue,MinValue.
public class Insertion {
    static Node root;
    void insert(int key) {
        root = insertRec(root, key);
    }
    public static Node insertRec(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(root.data>data)
        {
           root.left = insertRec(root.left,data);
        }
        else{
           root.right = insertRec(root.right,data);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    int minValue(Node root)
    {
        int minv=root.data;
        while(root.left!=null)
        {
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
    int maxValue(Node root)
    {
        int maxValue=root.data;
        while(root.right!=null)
        {
            maxValue=root.right.data;
            root=root.right;
        }
        return maxValue;
    }
    public static void main(String[] args)
    {
        Insertion is=new Insertion();
        is.insert(50);
        is.insert(30);
        is.insert(20);
        is.insert(40);
        is.insert(70);
        is.insert(60);
        is.insert(80);

        is.inorder(root);
        System.out.println();
        System.out.println("Smallest element is "+is.minValue(root));
        System.out.println("Largest element is "+is.maxValue(root));
    }
}
