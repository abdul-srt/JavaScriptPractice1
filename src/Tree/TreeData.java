package Tree;

import com.sun.source.tree.BinaryTree;

public class TreeData {
    static int i=-1;
    static class Node{
           int data;
           Node left;
           Node right;

           Node(int data)
           {
               this.data=data;
               left=null;
               right=null;
           }
    }

    public static Node buildTree(int nodes[])
    {
        i++;
        if(nodes[i]==-1)
            return null;
        Node newNode=new Node(nodes[i]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;


    }

    public static void preOrder(Node root)
    {
        if(root==null)
            return ;
        System.out.print(" "+root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }

    public static void postOrde(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrde(root.left);
        postOrde(root.right);
        System.out.print(" "+root.data);
    }




    public static void main(String[] args) {
        int arr[]={1, 2, 4,-1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeData tree =new TreeData();
        Node root= tree.buildTree(arr);
        preOrder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postOrde(root);

    }

}
