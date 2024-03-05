import java.util.*;
public class deque {

    static class queue{
        Deque<Integer> dq = new LinkedList<>();
        
        //addLast
        public void add(int data){
            dq.addLast(data);
        }

        //removeFirst
        public int remove(){
            return dq.removeFirst();
        }

        //peekFirst
        public int peek(){
            return dq.getFirst();
        }
    }


    static class stack{
        Deque<Integer> dq = new LinkedList<>();

        //addLast
        public void push(int data){
            dq.addLast(data);
        }

        //removeLast
        public int pop(){
            return dq.removeLast();
        }

        //peek
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String args[]){
        // stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s);
        // System.out.println(s.peek());
        // s.pop();
        // System.out.println(s);

        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.remove();
              

    }
}
