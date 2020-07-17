package BinaryTree;

public class countNodes {
    static Node root;
    static int countNodes(Node temp)
    {
        if(temp==null)
        {
            return 0;
        }
            int ans=1;
            ans=ans+countNodes(temp.left);
            ans=ans+countNodes(temp.right);
            return ans;
    }
        public static void main(String[] args)
        {
            Node root = new Node(2);
            root.left = new Node(7);
            root.right = new Node(5);
            root.left.left=new Node(99);
            root.left.right = new Node(6);
            root.left.right.left = new Node(1);
            root.left.right.right = new Node(11);
            root.right.right = new Node(9);
            root.right.right.left = new Node(4);

            int result=countNodes(root);
            System.out.println(result);

        }
    }
