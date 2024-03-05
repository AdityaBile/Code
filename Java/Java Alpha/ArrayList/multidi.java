import java.util.*;

public class multidi {
    public static void main(String[] args){
        // ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // multiList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // multiList.add(list2);

        // System.out.println(multiList);

        // for(int i=0; i<multiList.size(); i++){
        //     ArrayList<Integer> currList = multiList.get(i);
        //     for(int j =0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
             
        // }




        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        
        for(int i=1; i<=5; i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }

        ml.add(l1);
        ml.add(l2);
        ml.add(l3);

        System.out.println(ml);

        for(int i=0; i<ml.size(); i++){
            ArrayList<Integer> cl = ml.get(i);
            for(int j=0; j<cl.size(); j++){
                System.out.print(cl.get(j)+" ");
            }
            System.out.println();
        }
    }
}
