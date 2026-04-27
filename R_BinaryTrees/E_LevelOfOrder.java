package R_BinaryTrees;

import java.util.*;

public class E_LevelOfOrder {

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
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);

            return newNode;
        }
    }
    
    public static void LevelOfOrder(Node root){
    if(root == null){
        return;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
        Node currNode = q.remove();
        System.out.print(currNode.data + " ");

        if(currNode.left != null){
            q.add(currNode.left);
        }

        if(currNode.right != null){
            q.add(currNode.right);
        }
    }
  }
  public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    Node root = Binarytree.Buildtree(nodes);
    System.out.println("Level of Order Traversal of the Binary Tree: ");
    LevelOfOrder(root);
  }
}
