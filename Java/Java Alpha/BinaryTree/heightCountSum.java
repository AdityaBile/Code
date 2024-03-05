public class heightCountSum {
    static class Node{
        int data;
        Node left, right;

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

        int hl = height(root.left);
        int hr = height(root.right);

        return Math.max(hl,hr) + 1;
    }

    public static int count(Node root){
        if(root ==null){
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);
        
        return lc+rc+1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int ls = sum(root.left);
        int rs = sum(root.right);

        return ls + rs + root.data;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(9);

        System.out.println("Height of tree is : "+ height(root));
        System.err.println("Number of nodes in tree is : "+ count(root));
        System.out.println("Sum of weight of nodes in treee is : "+sum(root));
    }
}
