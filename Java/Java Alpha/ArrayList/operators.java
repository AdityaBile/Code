// package ArrayList;
import java.util.*;

public class operators {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add(val) - O(1)  -> pass value
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // // get(idx) - O(1) -> pass index
        // int ele = list.get(2);
        // System.out.println(ele);

        // //remove(idx) - O(n) -> pass index
        // list.remove(2);
        // System.out.println(list);

        // set element at index - set(idx, val) - O(n) -> (idx, val) 
        list.set(1, 9);
        System.out.println(list);

        // contains element - contains(val)
        System.out.println(list.contains(9));
        System.out.println(list.contains(4));

        //size()
        System.out.println(list.size());

        // print arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
