// package BTree;

public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    static class Btree{
        static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null; // will be used for traversal 
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); // newNodes left
            newNode.right = buildTree(nodes); // newNodes right

            return newNode;
        }
    }

    // preorder
    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Level order

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Btree tree = new Btree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
    }
}
