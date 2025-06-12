import java.util.*;

public class Binary_level {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int[] nodes) {
            idx++;
            // Prevent out-of-bounds and null node (-1)
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static void levelorder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // level marker

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // new level
                if (!q.isEmpty()) {
                    q.add(null); // next level marker
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) return 0;
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    public static int sumOfNodes(Node root) {
        if (root == null) return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static int heightOfTree(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }
    public static int diameter(Node root)
    {
        if(root!=null)
        {
            int leftD1=diameter(root.left);
            int rightD1=diameter(root.right);
            int rootD1=heightOfTree(root.left)+heightOfTree(root.right)+1;
            return Math.max(leftD1,Math.max(rightD1,rootD1));
            
        }
        return 0;
    }
    static class TreeInfo{
        int ht;
        int dt;
        TreeInfo(int ht,int dt)
        {
            this.ht=ht;
            this.dt=dt;
        }
    }
    public static TreeInfo diameter2(Node root)
    {
        if(root==null)
        {
           return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.ht,right.ht)+1;

        int diam1=left.dt;
        int diam2=right.dt;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myinfo=new TreeInfo(myHeight,mydiam);
        return myinfo;
    }

    public static void main(String[] args) {
        // Use a proper preorder input (with -1 for null nodes)
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 15, -1, -1, 7, -1, 8, -1, -1};

        Node root = BinaryTree.BuildTree(nodes);

        System.out.println("Level Order Traversal:");
        levelorder(root);

        System.out.println("\nTotal number of nodes: " + countOfNodes(root));
        System.out.println("Sum of all nodes: " + sumOfNodes(root));
        System.out.println("Height of tree: " + heightOfTree(root));
        System.out.println("Diameter of tree: "+diameter(root));
        System.out.println(diameter2(root).dt);
    }
}
