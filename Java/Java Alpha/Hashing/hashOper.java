// package Hashing;

import java.util.*;

import javax.swing.RowFilter.Entry;
public class hashOper {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("A", 1);
        hm.put("B",2);
        hm.put("C",3);
        hm.put("D",4);

        System.out.println(hm.get("Get :"+"A"));
        System.out.println(hm.containsKey("E"));
        System.out.println(hm.containsKey("D"));

        System.out.println(hm.remove("D"));
        System.out.println(hm);
 
        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());

        HashMap<String, Integer> hp = new HashMap<>();
        hp.put("A",1);
        hp.put("B",2);
        hp.put("C",3);
        
        Set<String> keys = hp.keySet();
        //set of keys
        System.out.println(keys);

        // key value from keys
        for (String Name : keys) {
            System.out.println("Key = "+Name+" , Value = "+hp.get(Name));
            
        }

        //Key-value
        Set<Map.Entry<String,Integer>> key1 = hp.entrySet();
        System.out.println(key1);
    }
}
