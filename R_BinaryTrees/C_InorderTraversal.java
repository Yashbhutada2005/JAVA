package R_BinaryTrees;

public class C_InorderTraversal {
    
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

        static class Binarytree {
            static int idx = -1;

            public static Node Buildtree(int nodes[]){
                idx ++ ;

                if(nodes[idx] == -1){
                    return null;
                }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);

            return newNode;
            }
        }

        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

            Node root = Binarytree.Buildtree(nodes);
            System.out.println("Inorder Traversal of the Binary Tree: ");
            Inorder(root);
      } 
}
