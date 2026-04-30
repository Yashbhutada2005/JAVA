package R_BinaryTrees;

public class H_SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int SumOfNodes(Node root){
        if(root == null){
            return 0 ; 
        }
        int LeftSum = SumOfNodes(root.left);
        int RightSum = SumOfNodes(root.right);

        return LeftSum + RightSum + root.data ;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);   
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Sum of Nodes in the Binary Tree is: " + SumOfNodes(root));
    }
}
