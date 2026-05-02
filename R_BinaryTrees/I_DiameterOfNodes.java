// Diameter - it ia a longest path between any two nodes in a tree. 

package R_BinaryTrees;

public class I_DiameterOfNodes {
    
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

    public static int height(Node root){

        if(root == null){
            return 0;
        }

        int LeftHeight = height(root.left);
        int RightHeight = height(root.right);
        return Math.max(LeftHeight, RightHeight) + 1;

    }

    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int LeftDiameter = Diameter(root.left);
        int RightDiameter = Diameter(root.right);
        
        int LeftHeight = height(root.left);
        int RightHeight = height(root.right);

        int SelfDiameter = LeftHeight + RightHeight + 1;

        return Math.max(SelfDiameter , Math.max(LeftDiameter, RightDiameter));
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);   
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter of the Binary Tree is: " + Diameter(root));
    }
}
