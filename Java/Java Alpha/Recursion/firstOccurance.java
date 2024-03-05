package Recursion;

public class firstOccurance {
    public static int firstOcc(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }
        // kaam
        if(arr[i]==key)
        return i;
        // loop
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,2,4,5,7,8};
        System.out.println(firstOcc(arr, 5, 0));
    }
}
