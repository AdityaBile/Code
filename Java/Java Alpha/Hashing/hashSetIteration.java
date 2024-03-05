import java.util.*;
public class hashSetIteration {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("India");
        cities.add("US");
        cities.add("Nepal");
        cities.add("Iran");

        /* 
        // Using Iterators
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */

        for (String city : cities) {
            System.out.println("Cities in hashSet are : "+city);
        }
    }
}
