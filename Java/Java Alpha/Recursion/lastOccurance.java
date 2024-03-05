// package Recursion;

public class lastOccurance {
    public static int lastOcc(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }
        // kaam
        int isFound = lastOcc(arr, key, i+1); 
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        // function
        return isFound;
    }

    // public static int lastOcc(int arr[], int key, int i){
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     int isFound =  lastOcc(arr, key, i+1);

    //     if(isFound != -1){
    //         return isFound;
    //     }

    //     if(arr[i] == key){
    //         return i;
    //     }

    //     return isFound;
    // }


    public static void main(String[] args){
        // int arr[] = {2,3,4,7,8,9,2,3,4};
        int arr[] = {2,3,3,3,3,3};
        System.out.println(lastOcc(arr, 3, 0));
    }
}
