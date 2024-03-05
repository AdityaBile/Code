// import java.util.*;

// import javax.swing.plaf.synth.SynthStyleFactory;
// public class waterColl {
//     public static int maxWater(ArrayList<Integer> l1){
//         int maxColl =0;
//         for(int i=0; i<l1.size(); i++){
//             for(int j=i+1; j<l1.size(); j++){
//                 int ht = Math.min(l1.get(j), l1.get(i));
//                 int width = j-i; 
//                 int curr = ht*width;
//                 maxColl = Math.max(maxColl, curr);
//             }
//         }
//         return maxColl;
//     }
//     public static void main(String[] args){
//         // 1,8,6,2,5,4,8,3,7

//         ArrayList<Integer> l1 = new ArrayList<>();
//         l1.add(1);
//         l1.add(8);
//         l1.add(6);
//         l1.add(2);
//         l1.add(5);
//         l1.add(4);
//         l1.add(8);
//         l1.add(3);
//         l1.add(7);

//         System.out.println(l1);
//         System.out.println("Maximun water stored is : " + maxWater(l1));        
//     }
// }


import java.util.*;
public class waterColl{
    public static int maxWater(ArrayList<Integer> l1){
        int lb = 0;
        int ub = l1.size()-1;
        int maxColl = 0;

        while(lb<ub){
            int  wt = ub - lb;
            int ht = Math.min(l1.get(lb), l1.get(ub));
            int curr = ht * wt; 
            maxColl = Math.max(maxColl, curr);

            if(l1.get(lb) < l1.get(ub)){
                lb++;
            }
            else{
                ub--;
            }

        }
        return maxColl;
    }
    public static void main(String[] args){
        // 1,8,6,2,5,4,8,3,7
        
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(8);
        l1.add(6);
        l1.add(2);
        l1.add(5);
        l1.add(4);
        l1.add(8);
        l1.add(3);
        l1.add(7);
        
        System.out.println(l1);
        System.out.println("Maximum water is : "+ maxWater(l1));
    }
}