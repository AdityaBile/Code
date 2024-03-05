// package BinaryTree2;
import java.util.*;

public class diameter {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }        
    }

    public static void  preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) +1;

    }

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }

        int lHei = height(root.left);   
        int lDia = diameter2(root.left);

        int rHei = height(root.right);
        int rDia = diameter2(root.right);

        int selfDia = lHei + rHei + 1;
        return Math.max(selfDia, Math.max(lDia, rDia));
    }

    static class Info{
        int dia;
        int ht;

        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo =  diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;

        return new Info(dia, ht);
    }

    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        else if(root == null || subroot == null || root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;

    }

    public static boolean subTree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }

        }
        return subTree(root.left, subroot) || subTree(root.right, subroot);

    }
    public static void main(String args[]){
        //             1
        //         2       3
        //     4   5       6   7
        // 8

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.left.left.left = new Node(8);

                    //     2
                    // 4       5

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        // System.out.println("Diameter of tree is : "+ diameter2(root));
                                    // OR
        // System.out.println("Diameter of tree is : "+ diameter(root).dia);
        // System.out.println("Height of tree is : "+diameter(root).ht);

        System.out.println("Check is subTree or not : " + subTree(root, subroot));



        

    }

                            // Or


    // public static void main(String args[]){
    //     // int nodes[] = {-1, 10, -1, 9, -1, 4, -1, 2, -1, 5, -1, 6, -1, 7, -1, 1, 3, -1,-1};
    //     int nodes[] = {1,2,4,9,10,-1,-1,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
    //     BinaryTree tree = new BinaryTree();
    //     Node root = tree.buildTree(nodes);
    //     System.out.println(root.data);
    //     System.out.println("Diameter of tree is : "+diameter(root));
        
    // }
}
