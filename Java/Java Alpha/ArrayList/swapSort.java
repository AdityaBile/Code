import java.util.*;
public class swapSort {

    public static void swapFun(ArrayList<Integer> list){
        int temp = list.get(2);
        list.set(2, list.get(3));
        list.set(3, temp);
        return;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Given arraylist : "+list);

        swapFun(list);

        System.out.println("Swap : "+list);

        Collections.sort(list);
        System.out.println("Sort in ascending : "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sort in descending : "+list);

    }
}
