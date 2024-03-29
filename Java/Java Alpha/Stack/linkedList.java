import java.util.*;
public class linkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
            }

            newNode.next = head;
            head = newNode; 
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head=head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}
