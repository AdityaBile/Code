package Recursion;
public class tileProblem {
    public static int tilling(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // horizontal
        int tile2 = tilling(n-2);

        // vertical
        int tile1 = tilling(n-1);        
        //recurrsion
        int totalWay = tile1 + tile2;
        return totalWay;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(tilling(4));
    }
}
