package BinaryTree;

public class FindMirrorNodeValue {
    static Node root;
    public static void main(String[] args)
    {
        root = new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(4);
        root.left.left.right = new Node(7);
        root.right= new Node(3);
        root.right.left= new Node(5);
        root.right.right= new Node(6);
        root.right.left.left= new Node(8);
        root.right.left.right= new Node(9);

        int target = root.left.left.key;

        int mirror = findMirror(root, target);

        if (mirror != 0)
            System.out.println("Mirror of Node " + target + " is Node " + mirror);
        else
            System.out.println("Mirror of Node " + target + " is null ");
    }
    static int findMirror(Node root, int target)
    {
        if (root == null)
            return 0;
        if (root.key == target)
            return target;
        return findMirrorRec(target, root.left, root.right);
    }

    static int findMirrorRec(int target, Node left, Node right)
    {
    /* if any of the Node is none then Node itself and decendent have no mirror, so return
    none, no need to further explore! */
        if (left==null || right==null)
            return 0;

    /* if left Node is target Node, then return right's key (that is mirror) and vice
    versa */
        if (left.key == target)
            return right.key;

        if (right.key == target)
            return left.key;

        // first check external Nodes
        int mirror_val = findMirrorRec(target, left.left, right.right);
        if (mirror_val != 0)
            return mirror_val;

        // if no mirror found then check internal Nodes
        return findMirrorRec(target, left.right, right.left);
    }

}
