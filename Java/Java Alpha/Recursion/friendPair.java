package Recursion;

public class friendPair {
    public static int frdPair(int n){
        // base
        if(n ==1 || n==2){
            return n;
        }
        // kaam
        // Single
        int sing = frdPair(n-1);
        // Pair
        int pair = (n-1) * frdPair(n-2);
        int totalWay = sing + pair;
        return totalWay;
    }
    public static void main(String[] args){
        System.out.println(frdPair(4));
    }
}
