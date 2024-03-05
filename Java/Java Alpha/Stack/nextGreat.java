import java.util.*;
public class nextGreat {
    

    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int great[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                great[i] = -1;
            }
            else{
                great[i] = arr[s.peek()];
            }
            s.push(i);
        }

        System.out.println("Next Greater elements are : ");
        for(int i=0; i<great.length; i++){
            System.out.print(great[i]+" ");
        }
        System.out.println();
        
    }
}
