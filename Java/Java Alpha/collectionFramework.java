import java.util.*;
public class collectionFramework {
    public static void main(String a[]){
        //List
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2, 3);
        list.add("hi");
        System.out.println(list);
        List<Integer> list1 = new ArrayList<Integer>();
        

        //ArrayList
        ArrayList arr = new ArrayList();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(2, 3);
        System.out.println(arr);
    }
}
