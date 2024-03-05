public class quickSort {
    public static void printArry(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSortFun(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int idx = pivot(arr, si, ei);
        quickSortFun(arr, si, idx-1);
        quickSortFun(arr, idx+1, ei);
    }

    public static int pivot(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i= si-1;
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        i++;
            int temp = pivot; 
            arr[ei] = arr[i];
            arr[i] = temp;
        return i;
    }
    public static void main(String[] args){
       int arr[] = {6, 3, 9, 8, 2, 5}; 
       quickSortFun(arr, 0, arr.length-1);
       printArry(arr);
    }
}
