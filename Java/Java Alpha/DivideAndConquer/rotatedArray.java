public class rotatedArray {
    public static int rotated(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si + (ei- si)/2;
        if(arr[mid] == tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            // Left
            if(arr[si]<=tar && tar<=arr[mid]){
                return rotated(arr, tar, si, mid-1);
            }
            else{
                return rotated(arr, tar, mid+1, ei);
            }
        }
        else{
            // right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return rotated(arr, tar, mid+1, ei);
            }
            else{
                return rotated(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        int indx= rotated(arr, target, 0, arr.length-1);
        System.out.println(indx);


    } 
}
