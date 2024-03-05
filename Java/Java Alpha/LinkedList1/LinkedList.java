// package LinkedList1;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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

        //Step 3 : head -> newNode
        head = newNode;
    }

    // Adding at last   -> O(1)
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    // print linked list  ->  O(n)
    public void print(){
        // if(head==null){
        //     System.out.println("null");
        // }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
        return;
    }

    // Add Between  : Time complexity - [O(n) -> need to search idx]
    public void addBetween(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // temp (prev)
        newNode.next = temp.next;
        temp.next = newNode;
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
        size--;
        return val;
    }

    // remove tail node  ->  0(n)
    public int removeLast(){
        if(size==0){
            System.out.println("Empty list");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            size=0;
            int val = tail.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        size--;
        prev.next = null;
        tail = prev;
        return val;
    }

    // Iterative search   ->  O(n)
    public int itrSearch(int key){
        Node temp = head;
        int idx =0;

        while(temp!=null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Recursive search 
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recurrSearch(int key){
        return helper(head, key);
    }

    // Reverse linked list  ->  O(n)
    public void reverseList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;            
        }
        head = prev;
    }

    // Remove nth node from last
    public void removeNth(int num){
        // num is size from last is head
        if(num==size){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size-num;

        Node prev = head;
        while(i<iToFind){
            prev  = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        size--;
        return;
    }

    // public static void main(String[] args){
    //     LinkedList ll = new LinkedList();
    //     // add first
    //     ll.addFirst(1);
    //     ll.addFirst(2);
    //     ll.addFirst(3);
    //     // add last
    //     ll.addlast(4);
    //     // print
    //     ll.addBetween(2,9);
    //     ll.addBetween(0, 10);
    //     ll.print();
    //     System.out.println("Size of Linked List : "+ ll.size);
    //     ll.removeFirst();
    //     ll.removeLast();
    //     ll.print();
    //     System.out.println("Size of linked list is : "+ll.size);
    //     ll.addBetween(3, 34);
    //     ll.addBetween(1,7);
    //     System.out.println("Current list is : ");
    //     ll.print();
    //     System.out.println("index of 7 is : "+ll.itrSearch(34));
    //     System.out.println("index of 7 is : "+ll.recurrSearch(34));
    //     System.out.println("Reverse linked list : ");
    //     ll.reverseList();
    //     ll.print();
    //     ll.removeNth(3);
    //     ll.print();
    //     System.out.println("Size of linkedlist"+ll.size);
    // }

    // Check Palindrome ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // slow fast for midNode -----
    public Node midNode(Node head){
        Node slow = head;
        Node fast =head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        // for single node or null node
        if(head == null || head.next == null){
            return true;
        }

        // Step 1 - find midNode
        Node mid = midNode(head);

        // Step 2 - reverse half
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3 - check right and left are equal
        Node left = head;
        Node right = prev;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    /* 
    public static void main(String[] args){
        // System.out.println("hi");
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addlast(2);
        list.addlast(2);
        list.addlast(1);
        list.addlast(1);

        System.out.println(list.checkPalindrome());  
    }
    */

    public void zigZag(){
        // Find mid (last of first half)
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // zig-zag
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.addlast(1);
        l.addlast(2);
        l.addlast(3);
        l.addlast(4);
        l.addlast(5);
        // l.addlast(6);
        // original ll
        l.print();
        // zig zag linked list
        l.zigZag();
        l.print();
    }


}
