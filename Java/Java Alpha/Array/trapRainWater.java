package Array;
import java.util.*;
public class trapRainWater {
    public static int trappedWater(int water[], int height[], int width, int htSize){
        int totalTrapWater = 0;
        if(htSize<=2){
            return totalTrapWater;
        }
        else{
            for(int i=0; i<height.length-1; i++){
                totalTrapWater = totalTrapWater + ((water[i]-height[i])*width);
            }
            //Ascending or Descending
            if(totalTrapWater < 0){
                totalTrapWater =0;
            }
        }
        return totalTrapWater;
    }

    public static void waterLevel(int height[], int left[], int right[], int water[], int htSize){
        // Base Case
        if(htSize<=2){
            System.out.println("No water can  be stored");
        }
        else{
            for(int i=0; i<water.length; i++){
                water[i] = Math.min(left[i], right[i]);
            }            
        }
    }

    public static void auxilary(int height[], int left[], int right[]){
        int maxLeft = 0;
        int maxRight = 0;
        // Left Array
        for(int i=0; i<left.length; i++){
            maxLeft = Math.max(maxLeft, height[i]);
            left[i] = maxLeft;
        }

        //Right Array
        for(int j = right.length - 1; j>=0; j--){
            maxRight = Math.max(maxRight, height[j]);
            right[j] = maxRight;
        }
    }
    public static void main(String[]args){
        // height = [4,2,0,6,3,2,5]
        int height[] = {1,2,3};
        int htSize = height.length;
        int width = 1;       
        
        int left[] = new int[htSize];
        int right[] = new int[htSize];
        int water[] = new int[htSize];
        
        auxilary(height, left, right);

        // Water level
        waterLevel(height, left, right, water, htSize);

        //Trapped Water
        int WaterTrapped = trappedWater(water, height, width, htSize);

        System.out.println("Total water trapped is : "+ WaterTrapped);
    }

}
