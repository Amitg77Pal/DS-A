//same code in Binary_level with some modification
import java.util.*;
public class Binary_level1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[])
        {
            idx++;
           
            // Base condition to avoid ArrayIndexOutOfBoundsException
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
             Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }
    // public static void inorder(Node root)
    // {
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     inorder(root.left);
    //     System.out.print(root.data+" ");
    //     inorder(root.right);
    // }
    public static void levelorder(Node root)
    {
         if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

       
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
               if(q.isEmpty())
               {
                break;
               }
               else{
                q.add(null);
               }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countOfNodes(Node root){
        
        if(root!=null)
        {
            int leftNodes=countOfNodes(root.left);
            int rightNodes=countOfNodes(root.right);
            int x=leftNodes+rightNodes+1;
            return x;
        }
        return 0;
    }
    public static int sumOfNodes(Node root)
    {
        if(root!=null)
        {
            
            int leftNodeSum=sumOfNodes(root.left);
            int rightNodeSum=sumOfNodes(root.right);
            int x=leftNodeSum+rightNodeSum+root.data;
            return x;

        }
        return 0;
    }

    public static int heightOfTree(Node root)
    {
        if(root!=null)
        {
            int leftHeight=heightOfTree(root.left);
            int rightHeight=heightOfTree(root.right);
            int maxHeight=Math.max(leftHeight,rightHeight);
            return maxHeight+1;
        }
        return 0;

    }
    
    public static void main(String[] args)
    {
        int nodes[]={1,2,4,-1,5,-1,-1,3,-1,6,15,7,8};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        levelorder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));


    }
    
}