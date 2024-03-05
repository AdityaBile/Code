public class doublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Adding at head  ->  O(1)
    public void addFirst(int data){
        // Step 1 : create new node
        Node newNode  = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2 : newNode .next -> head;
        newNode.next = head;
        head.prev = newNode;

        //Step 3 : head -> newNode
        head = newNode;
    }

    // Remove head node  ->  O(1)
    public int removeFirst(){
        if(size==0){
            System.out.println("Empty list");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            size=0;
            int val = head.data;
            head = tail = null;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }



}
