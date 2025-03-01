package Practice;

public class Tree {
    static class Node
    {
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
Node root;
    public void insert(int data)
    {
        root=build(root,data);
//        System.out.println(root.data);
    }

    public Node build(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
        }
        else{

            if(data<root.data)
            {
             root.left=   build(root.left,data);
            } else if (data>root.data) {
                root.right=build(root.right,data);
            }

        }
        return root;
    }

    void display() {
        displayRec(root, 0);
    }

    void displayRec(Node root, int level) {
        if (root != null) {
            displayRec(root.right, level + 1);
            System.out.print(" ".repeat(level * 4) + root.data + "\n");
            displayRec(root.left, level + 1);
        }
    }
    void displayArrayFormat() {
        int height = height(root);
        int maxNodes = (int) Math.pow(2, height) - 1; // Maximum number of nodes at the last level
        Integer[] arr = new Integer[maxNodes];

        fillArray(root, arr, 0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }

    // Helper method to fill the array
    void fillArray(Node node, Integer[] arr, int index) {
        if (node == null) {
            return;
        }
        arr[index] = node.data;
        fillArray(node.left, arr, 2 * index + 1);  // Left child index
        fillArray(node.right, arr, 2 * index + 2); // Right child index
    }

    // Calculate the height of the tree
    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static void main(String[] args) {
        Tree t= new Tree();
        t.insert(144);
        t.insert(54);
        t.insert(153);
        t.insert(122);
        t.insert(9);

t.displayArrayFormat();

    }
}
