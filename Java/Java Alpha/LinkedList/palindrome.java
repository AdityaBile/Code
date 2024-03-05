import java.util.*;
// package LinkedList;

public class palindrome {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        System.out.println(ll);
    }
}
