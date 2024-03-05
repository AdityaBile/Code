// package Heap;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQ { 
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pp = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(1);
        pq.add(7);
        pq.add(5);
        
        pp.add(5);
        pp.add(3);
        pp.add(7);
        pp.add(1);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

        System.out.println("Reverse order");

        while(!pp.isEmpty()){
            System.out.println(pp.peek());
            pp.remove();
        }
    }
}
