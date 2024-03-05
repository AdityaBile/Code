import java.util.*;
public class Prog {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Integer[] arr = new Integer[6];
        for(int i =0; i<=5; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println("Sort Ascending");

        //sorting in ascending order
        Arrays.sort(arr);

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Sort Descending");
        //sort.inig in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
