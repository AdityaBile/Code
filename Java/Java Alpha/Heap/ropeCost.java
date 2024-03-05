/*Connect all ropes. 
Cost of rope is its length.
Find minimum cost of rope
*/

import java.util.*;
public class ropeCost {
    public static void main(String[] args){
        int rope[] = {2,3,3,4,6};
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for(int i=0; i<rope.length; i++){
            pq.add(rope[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();

            cost += min1+min2;
            pq.add(min1+min2);
        }
        System.out.println("Minimum cost of N ropes joined together is : "+cost);
    }
}
