package R_BinaryTrees;

public class A_BuildTree {
    
    // Node class
    static class Node {
        int data; 
        Node left; 
        Node right;

        // constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     // Binary tree class
     static class BinaryTree{
        static int idx = -1;
        // method to build tree
        public static Node buildtree(int nodes[]){
          idx++;
        
          if(nodes[idx] == -1){
            return null;
          }

          // create new node
          Node newNode = new Node(nodes[idx]);
          newNode.left = buildtree(nodes);
          newNode.right = buildtree(nodes);
          return newNode;
        }
     }
     public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        // build tree
        BinaryTree tree = new BinaryTree();
        // build tree and store the root node in root variable
        Node root = tree.buildtree(nodes);
        System.out.print(root.data);
     }
}

