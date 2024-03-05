package Recursion;

public class Factorial {
    // public static int Fact(int n){
    //     // int fact = 1;
    //     if(n==0){
    //         return 1;
    //     }
    //     int factNM1 = Fact(n-1);
    //     int fact = n * factNM1;
    //     return fact;
    // }
    // public static void main(String[] args){
    //     int n=5;
    //     System.out.println("Factorial of number is : "+ Fact(n));
    // }


    public static int Fact(int n){
        //base
        if(n==0) return 1;
        //kaam
        int fnm1 = Fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args){
        System.out.println("Factorial of n is: "+Fact(5));
    }
}
