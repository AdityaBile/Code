package Recursion;

public class SumOfN {
    // public static int SumN(int n){
    //     // int sum = 0;
    //     if(n==1){
    //         return 1;
    //     }
    //     // int sumnm1 = ((n-1)*n)/2;
    //     int sumnm1 = SumN(n-1);
    //     // System.out.println("Sum of n-1 is : "+sumnm1);
    //     int sum = n + sumnm1;
    //     return sum;
    // }
    // public static void main(String[] args){
    //     int n=5;
    //     System.out.println("Sum of n numbers is  : "+SumN(n));
    // }


    public static int SumN(int n){
        //base
        if(n==1) return 1;
        //kaam
        int fnm1 = SumN(n-1);
        int fn = n + fnm1;

        return fn;
    }
    public static void main(String[] args){
        System.out.println("Sum of n numbers is : "+SumN(5));
    }
}
